package com.shuai.demonstration.repository;

import com.shuai.demonstration.entity.mysql.ChsellOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yangs
 */
public interface ChsellOrderRepository extends JpaRepository<ChsellOrder, String> {

    ChsellOrder findAllById(String id);
}
