package cn.sz.twoOfGroup.entity;

import java.io.Serializable;

/**
 * (StsOrderDetail)实体类
 *
 * @author makejava
 * @since 2020-08-31 17:30:22
 */
public class StsOrderDetail implements Serializable {
    private static final long serialVersionUID = 233572308239655015L;
    /**
     * 订单详情编号
     */
    private Integer detailId;
    /**
     * 订单号
     */
    private String orderNum;
    /**
     * 股票代码
     */
    private String detailCode;
    /**
     * 股票名称
     */
    private String detailName;
    /**
     * 股票当前价格
     */
    private Double detailPrice;
    /**
     * 股票买（卖）入量
     */
    private Integer detailCount;
    /**
     * 买入（卖出）金额
     */
    private Double detailMoney;
    /**
     * 最终交易金额（单只股）
     */
    private Double detailRealmoney;
    /**
     * 订单类型(买，卖)
     */
    private Integer detailType;
    /**
     * 订单状态（成交，撤，废，是否正在交易）
     */
    private Integer detailStatus;


    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
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

    public Double getDetailPrice() {
        return detailPrice;
    }

    public void setDetailPrice(Double detailPrice) {
        this.detailPrice = detailPrice;
    }

    public Integer getDetailCount() {
        return detailCount;
    }

    public void setDetailCount(Integer detailCount) {
        this.detailCount = detailCount;
    }

    public Double getDetailMoney() {
        return detailMoney;
    }

    public void setDetailMoney(Double detailMoney) {
        this.detailMoney = detailMoney;
    }

    public Double getDetailRealmoney() {
        return detailRealmoney;
    }

    public void setDetailRealmoney(Double detailRealmoney) {
        this.detailRealmoney = detailRealmoney;
    }

    public Integer getDetailType() {
        return detailType;
    }

    public void setDetailType(Integer detailType) {
        this.detailType = detailType;
    }

    public Integer getDetailStatus() {
        return detailStatus;
    }

    public void setDetailStatus(Integer detailStatus) {
        this.detailStatus = detailStatus;
    }

}