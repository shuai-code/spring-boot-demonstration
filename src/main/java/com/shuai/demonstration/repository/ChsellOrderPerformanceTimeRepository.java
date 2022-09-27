package com.shuai.demonstration.repository;

import com.shuai.demonstration.entity.mysql.ChsellOrderPerformanceTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Yangs
 */
public interface ChsellOrderPerformanceTimeRepository extends JpaRepository<ChsellOrderPerformanceTime, Integer> {

    List<ChsellOrderPerformanceTime> findAllByOrderId(String orderId);
}
