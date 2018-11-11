package com.bj.glocloud.entity.order;

import com.bj.glocloud.entity.user.AddressEntity;
import com.bj.glocloud.entity.user.AddressEntity;
import com.bj.glocloud.entity.user.UserEntity;
import com.bj.glocloud.enumeration.order.OrderStateEnum;
import com.bj.glocloud.enumeration.order.PayModeEnum;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Xionge
 * @date 2018/11/10
 * @description Order Entity
 */
public class OrdersEntity implements Serializable {

    /**
     * 订单编号(主键)
     */
    private String id;

    /**
     * 买家ID
     */
    private UserEntity buyer;

    /**
     * 卖家详情
     */
    private UserEntity company;

    /**
     * 产品-订单的关系列表(订单中某一产品的数量)
     */
    private List<ProductOrderEntity> productOrderList;

    /**
     * 订单状态
     */
    private OrderStateEnum orderStateEnum;

    /**
     * 订单到达各个状态的时间
     */
    private List<OrderStateTimeEntity> orderStateTimeList;

    /**
     * 支付方式
     */
    private PayModeEnum payModeEnum;

    /**
     * 订单总金额
     */
    private String totalPrice;

    /**
     * 发票信息
     */
    private ReceiptEntity receiptEntity;

    /**
     * 收货地址
     */
    private AddressEntity addressEntity;

    /**
     * 买家备注信息
     */
    private String remark;

    /**
     * 物流单号
     */
    private String expressNo;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public UserEntity getCompany() {
        return company;
    }

    public void setCompany(UserEntity company) {
        this.company = company;
    }

    public List<ProductOrderEntity> getProductOrderList() {
        return productOrderList;
    }

    public void setProductOrderList(List<ProductOrderEntity> productOrderList) {
        this.productOrderList = productOrderList;
    }

    public OrderStateEnum getOrderStateEnum() {
        return orderStateEnum;
    }

    public void setOrderStateEnum(OrderStateEnum orderStateEnum) {
        this.orderStateEnum = orderStateEnum;
    }

    public List<OrderStateTimeEntity> getOrderStateTimeList() {
        return orderStateTimeList;
    }

    public void setOrderStateTimeList(List<OrderStateTimeEntity> orderStateTimeList) {
        this.orderStateTimeList = orderStateTimeList;
    }

    public PayModeEnum getPayModeEnum() {
        return payModeEnum;
    }

    public void setPayModeEnum(PayModeEnum payModeEnum) {
        this.payModeEnum = payModeEnum;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ReceiptEntity getReceiptEntity() {
        return receiptEntity;
    }

    public void setReceiptEntity(ReceiptEntity receiptEntity) {
        this.receiptEntity = receiptEntity;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public UserEntity getBuyer() {
        return buyer;
    }

    public void setBuyer(UserEntity buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "OrdersEntity{" +
                "id='" + id + '\'' +
                ", buyer=" + buyer +
                ", company=" + company +
                ", productOrderList=" + productOrderList +
                ", orderStateEnum=" + orderStateEnum +
                ", orderStateTimeList=" + orderStateTimeList +
                ", payModeEnum=" + payModeEnum +
                ", totalPrice='" + totalPrice + '\'' +
                ", receiptEntity=" + receiptEntity +
                ", addressEntity=" + addressEntity +
                ", remark='" + remark + '\'' +
                ", expressNo='" + expressNo + '\'' +
                '}';
    }
}
