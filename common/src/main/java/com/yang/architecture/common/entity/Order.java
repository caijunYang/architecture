package com.yang.architecture.common.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by caijun.yang on 2016/8/21.
 */
public class Order {
    private  Long uuid;
    private  Long customerUuid;
    private Date orderTime;
    private BigDecimal totalMoney;
    private BigDecimal saveMoney;
    private Integer state;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Long getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(Long customerUuid) {
        this.customerUuid = customerUuid;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(BigDecimal saveMoney) {
        this.saveMoney = saveMoney;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "uuid=" + uuid +
                ", customerUuid=" + customerUuid +
                ", orderTime=" + orderTime +
                ", totalMoney=" + totalMoney +
                ", saveMoney=" + saveMoney +
                ", state=" + state +
                '}';
    }
}
