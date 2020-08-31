package cn.sz.twoOfGroup.entity;

import java.io.Serializable;

/**
 * (StsOrderHouse)实体类
 *
 * @author makejava
 * @since 2020-08-31 17:31:24
 */
public class StsOrderHouse implements Serializable {
    private static final long serialVersionUID = -82574191247511060L;
    /**
     * 主键id
     */
    private Integer houseId;
    /**
     * 股票代码
     */
    private String detailCode;
    /**
     * 股票名称
     */
    private String detailName;
    /**
     * 当前持股
     */
    private Integer houseCount;
    /**
     * 可卖股数
     */
    private Integer houseUsable;
    /**
     * 持仓成本
     */
    private Double houseMoney;

    private String houseMarket;


    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public Integer getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(Integer houseCount) {
        this.houseCount = houseCount;
    }

    public Integer getHouseUsable() {
        return houseUsable;
    }

    public void setHouseUsable(Integer houseUsable) {
        this.houseUsable = houseUsable;
    }

    public Double getHouseMoney() {
        return houseMoney;
    }

    public void setHouseMoney(Double houseMoney) {
        this.houseMoney = houseMoney;
    }

    public String getHouseMarket() {
        return houseMarket;
    }

    public void setHouseMarket(String houseMarket) {
        this.houseMarket = houseMarket;
    }

}