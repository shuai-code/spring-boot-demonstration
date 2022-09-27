package com.shuai.demonstration.entity.mysql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class ChsellBusiState {

    @Id
    private Integer id;

    private String productId;

    private Integer nodeId;

    private String busiState;

    private String name;

    private String remark;

    private String type;

    private Integer sort;

    private Boolean deleted;

    private String pType;

    private Boolean isDefault;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
