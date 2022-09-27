package com.shuai.demonstration.entity.mysql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author Yangs
 */
@Data
@Entity
public class ChsellOrderPerformanceTime {

    @Id
    private Integer id;

    private String busiState;

    private String busiStateName;

    private String nodeState;

    private Integer nodeId;

    private Integer isPerformanceTime;

    private LocalDateTime performanceTime;

    private String orderId;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
