package com.xxgc.pojo;

import javax.persistence.*;
import java.util.Date;

public class Product {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * 产品编号
     */
    @Column(name = "product_num")
    private String productNum;

    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 出发城市
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 出发时间
     */
    @Column(name = "departure_time")
    private Date departureTime;

    /**
     * 产品价格
     */
    @Column(name = "product_price")
    private Integer productPrice;

    /**
     * 产品描述
     */
    @Column(name = "product_desc")
    private String productDesc;

    /**
     * 状态(0关闭，1开启)
     */
    @Column(name = "product_Status")
    private Integer productStatus;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取产品编号
     *
     * @return product_num - 产品编号
     */
    public String getProductNum() {
        return productNum;
    }

    /**
     * 设置产品编号
     *
     * @param productNum 产品编号
     */
    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    /**
     * 获取产品名称
     *
     * @return product_name - 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称
     *
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取出发城市
     *
     * @return city_name - 出发城市
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置出发城市
     *
     * @param cityName 出发城市
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取出发时间
     *
     * @return departure_time - 出发时间
     */
    public Date getDepartureTime() {
        return departureTime;
    }

    /**
     * 设置出发时间
     *
     * @param departureTime 出发时间
     */
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * 获取产品价格
     *
     * @return product_price - 产品价格
     */
    public Integer getProductPrice() {
        return productPrice;
    }

    /**
     * 设置产品价格
     *
     * @param productPrice 产品价格
     */
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 获取产品描述
     *
     * @return product_desc - 产品描述
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * 设置产品描述
     *
     * @param productDesc 产品描述
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    /**
     * 获取状态(0关闭，1开启)
     *
     * @return product_Status - 状态(0关闭，1开启)
     */
    public Integer getProductStatus() {
        return productStatus;
    }

    /**
     * 设置状态(0关闭，1开启)
     *
     * @param productStatus 状态(0关闭，1开启)
     */
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productNum='" + productNum + '\'' +
                ", productName='" + productName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", departureTime=" + departureTime +
                ", productPrice=" + productPrice +
                ", productDesc='" + productDesc + '\'' +
                ", productStatus=" + productStatus +
                '}';
    }
}