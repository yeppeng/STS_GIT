package cn.sz.twoOfGroup.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (StsOrder)实体类
 *
 * @author makejava
 * @since 2020-08-31 17:28:45
 */
public class StsOrder implements Serializable {
    private static final long serialVersionUID = 808394088751704297L;
    /**
     * 订单编号
     */
    private Integer orderId;
    /**
     * 订单号
     */
    private String orderNum;
    /**
     * 下单时间
     */
    private Date orderStart;
    /**
     * 成交时间
     */
    private Date orderEnd;

    private Integer accuserId;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderStart() {
        return orderStart;
    }

    public void setOrderStart(Date orderStart) {
        this.orderStart = orderStart;
    }

    public Date getOrderEnd() {
        return orderEnd;
    }

    public void setOrderEnd(Date orderEnd) {
        this.orderEnd = orderEnd;
    }

    public Integer getAccuserId() {
        return accuserId;
    }

    public void setAccuserId(Integer accuserId) {
        this.accuserId = accuserId;
    }

}