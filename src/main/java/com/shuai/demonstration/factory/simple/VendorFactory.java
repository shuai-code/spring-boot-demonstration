package com.shuai.demonstration.factory.simple;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Yangs
 */
@Component
public class VendorFactory<T> {

    /**
     * 这里要使用Resource, Autowired会有IDEA的BUG显示问题
     * */
    @Resource
    Map<String, AbstractVendor<T>> vendorMap;

    public ConcurrentHashMap<Integer, AbstractVendor<T>> vendorConcurrentHashMap = new ConcurrentHashMap<>();

    /**
     * 把这个方法接入ApplicationRunner中, 在SpringBoot启动完成后初始化厂商通道
     * */
    public void init() {
        for (AbstractVendor<T> vendor : vendorMap.values()) {
            Strategy strategy = vendor.getClass().getAnnotation(Strategy.class);
            if (strategy == null) {
                continue;
            }
            vendorConcurrentHashMap.put(strategy.type(), vendor);
        }
    }

    public AbstractVendor<T> getVendor(Integer type) {
        return vendorConcurrentHashMap.get(type);
    }
}
