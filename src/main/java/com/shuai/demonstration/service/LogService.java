package com.shuai.demonstration.service;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.BulkRequest;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import com.shuai.demonstration.annotation.RunTime;
import com.shuai.demonstration.annotation.RunTimeClass;
import com.shuai.demonstration.entity.mysql.ChsellBusiState;
import com.shuai.demonstration.entity.mysql.ChsellOrder;
import com.shuai.demonstration.entity.elasticsearch.SearchOrder;
import com.shuai.demonstration.entity.mysql.ChsellOrderPerformanceTime;
import com.shuai.demonstration.entity.mysql.ChsellProduct;
import com.shuai.demonstration.repository.ChsellBusiStateRepository;
import com.shuai.demonstration.repository.ChsellOrderPerformanceTimeRepository;
import com.shuai.demonstration.repository.ChsellOrderRepository;
import com.shuai.demonstration.repository.ChsellProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yangs
 */
@RunTimeClass
@Slf4j
@Service
public class LogService {
    @Autowired
    ElasticsearchClient elasticsearchClient;
    @Autowired
    ChsellOrderRepository chsellOrderRepository;
    @Autowired
    ChsellOrderPerformanceTimeRepository chsellOrderPerformanceTimeRepository;
    @Autowired
    ChsellBusiStateRepository chsellBusiStateRepository;
    @Autowired
    ChsellProductRepository chsellProductRepository;

    @RunTime
    public void addLog(String message) {
        log.info("方法执行......");
        if ("".equals(message)) {
            throw new RuntimeException("异常.....");
        }
    }

    public void selectOrder() throws IOException {
        int page = 0;
        while (page < 1) {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.ASC, "id");
            Page<ChsellOrder> pageResult = chsellOrderRepository.findAll(pageable);
            List<ChsellOrder> contents = pageResult.getContent();
            if (contents.isEmpty()) {
                break;
            }
            doProcess(contents);
            log.info("处理数据: {} 条", (page + 1) * 50);
            page++;
        }
    }

    public void doProcess(List<ChsellOrder> orders) throws IOException {
        BulkRequest.Builder builder = new BulkRequest.Builder();
        for (ChsellOrder order : orders) {
            SearchOrder searchOrder = makeSearchOrder(order);
            builder.operations(op -> op.index(idx -> idx.index("order").document(searchOrder)));
        }
        BulkResponse response = elasticsearchClient.bulk(builder.build());
    }

    public SearchOrder makeSearchOrder(ChsellOrder order) {
        SearchOrder searchOrder = new SearchOrder();
        BeanUtils.copyProperties(order, searchOrder);
        // 业绩时间
        List<ChsellOrderPerformanceTime> orderPerformanceTimes = chsellOrderPerformanceTimeRepository.findAllByOrderId(order.getId());
        List<String> dateTimes = orderPerformanceTimes.stream().map(ChsellOrderPerformanceTime::getPerformanceTime).map(LocalDateTime::toString).collect(Collectors.toList());
        searchOrder.setPerformanceTimes(dateTimes);
        // 业绩节点
        ChsellBusiState chsellBusiState = chsellBusiStateRepository.findAllByBusiStateAndProductId(order.getCustState(), order.getProductId());
        searchOrder.setPType(chsellBusiState.getPType());

        // 产品信息
        ChsellProduct chsellProduct = chsellProductRepository.findAllById(order.getProductId());
        return searchOrder;
    }

    public void createIndex() throws IOException {
        elasticsearchClient.indices().create(c -> c.index("search_order"));
    }
}
