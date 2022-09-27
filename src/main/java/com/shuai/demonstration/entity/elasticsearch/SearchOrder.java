package com.shuai.demonstration.entity.elasticsearch;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Yangs
 */
@Data
public class SearchOrder {

    private String id;

    private List<String> performanceTimes;

    private String pType;

    private String number;

    private String orgId;

    private String type;

    private String productId;

    private String agentId;

    private String agentType;

    private String guestId;

    private String companyName;

    private String regionId;

    private String cityId;

    private String materialImgIds;

    private Long money;

    private String status;

    /**
     * 自定义状态(某些产品特有)
     */
    private String custState;

    private String profitType;

    private Integer creditCardCount;

    /**
     * 业务时间(重复进件会更新此时间，对照上游也可能更新此时间)
     */
    private String busiTime;

    /**
     * 首次下单时间
     */
    private String createdOn;

    /**
     * 更新时间（即最后下单时间，默认与createdOn相同）。
     */
    private String updatedOn;

    private String auditMemo;

    private String createAccountDesc;

    private String district;

    /**
     * 授信额度
     */
    private BigDecimal creditLine;

    /**
     * 下款额度
     */
    private BigDecimal creditBalance;

    private String driverName;

    private String serial;

    private Integer couponRatio;

    private Boolean isKey;

    private Boolean ableWmd;

    private Double custProfit;

    private String kykUpdatedOn;

    private Boolean monthSettled;

    /**
     * 业务节点结算审批状态
     */
    private String busiStateAuditStatus;


    private Integer repeatCount;
    /**
     * 城市编码
     */
    private String areaCode;
    /**
     * 城市合伙人
     */
    private String cityPartner;
    /**
     * 新一贷用户身份证信息
     */
    private String idCard;

    private String settleType;

    private String upVerifyStatus;

    private String source;

    private String settleInterval;

    private String bdId;



    private Integer borrowLimit;

    private Double borrowRate;

    private String customerType;

    private String settlement;

    private String kfCustState;

    private String wechatPublicNumberSource;

    private String referralCode;

    private String agentArea;

    private String guestArea;
}
