package com.atguigu.domain;

import org.apache.solr.client.solrj.beans.Field;

public class KeywordsSku extends Sku{

    @Field("product_url")
    private String productImage;

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }
}
