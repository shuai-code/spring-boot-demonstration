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
public class ChsellProduct {

    @Id
    private String id;

    private String detailId;

    private String type;

    private Integer catalog;

    private String name;

    private String cName;

    private String depart;

    private String link;

    private String qrCodeImgId;

    private String brokerage;

    private String tags;

    private String rate;

    private Double rateDown;

    private Double rateUpper;

    private String rateMemo;

    private Double rateNum;

    private String moneyLimits;

    private Integer moneyNum;

    private String settleCycle;

    private String profitType;

    private String profitCfg;

    private String memo;

    private String logo;

    private String shareImg;

    private String detailImgs;

    private String usageImgs;

    private String districtRule;

    private Boolean requireCompany;

    private String custOrderStates;

    private String kykType;

    private Boolean displayed;

    private Boolean exclusive;

    private Integer sortNum;

    private Integer propSort;

    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;

    private String createrId;

    private Boolean deleted;

    private Integer generalizeCount;

    private Integer rebateSumMoney;

    private Boolean hasRecommend;

    private String qrCode;

    private Boolean requireLinear;

    private String linearSerial;

    private Boolean hasMaterial;

    private Boolean joinCreditRule;

    private Integer careCount;

    private Boolean multipleSettle;

    private String organIds;

    private Boolean isCheckQrCode;

    private String loanCycle;

    private String refundWay;

    private String payPeriods;

    private String insuranPeriods;

    private Boolean preSale;

    private Boolean isNew;

    private String applicablePeople;

    private Boolean hotSale;

    private Integer hotSaleSort;

    private Integer catalogSort;

    private Boolean extensionCostShow;

    private String dynamicLinkType;

    private Boolean platformProduct;

    private Integer dragSort;

    private Boolean isBorrowReturn;

    private Boolean isStaging;

    private String refundDayType;

    private Integer refundDay;
}
