package com.shuai.demonstration.repository;

import com.shuai.demonstration.entity.mysql.ChsellBusiState;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yangs
 */
public interface ChsellBusiStateRepository extends JpaRepository<ChsellBusiState, Integer> {

    ChsellBusiState findAllByBusiStateAndProductId(String busiState, String productId);
}
