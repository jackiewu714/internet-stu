package com.cw.stu.mybatis.dao.domain;

/**
 * 产品实体类
 *
 * @author WuLiangzhi  2018/09/27 22:27
 */
public class Product {

    private long id;
    private String productName;
    private String productContent;
    private String price;
    private int sort;
    private int falseSales;
    private long categoryId;
    private byte type;
    private byte state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductContent() {
        return productContent;
    }

    public void setProductContent(String productContent) {
        this.productContent = productContent;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getFalseSales() {
        return falseSales;
    }

    public void setFalseSales(int falseSales) {
        this.falseSales = falseSales;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }
}
