package com.shuai.demonstration.repository;

import com.shuai.demonstration.entity.mysql.ChsellProduct;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yangs
 */
public interface ChsellProductRepository extends JpaRepository<ChsellProduct, String> {

    ChsellProduct findAllById(String id);
}
