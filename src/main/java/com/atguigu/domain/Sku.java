package com.atguigu.domain;

import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

/**
 * 商品sku
 */
public class Sku {

    @Field("id")
    private Integer id;
    @Field("product_id")
    private Integer productId;   //商品id
    @Field("number")
    private Integer number;     //库存数量
    @Field("price")
    private Double price;       //价格
    @Field("create_time")
    private Date createTime;    //创建时间
    @Field("sku_name")
    private String skuName;     //sku名称
    @Field("sku_sales")
    private Long skuSales;   //sku销量
    @Field("address")
    private String address;     //库存地址

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Long getSkuSales() {
        return skuSales;
    }

    public void setSkuSales(Long skuSales) {
        this.skuSales = skuSales;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}