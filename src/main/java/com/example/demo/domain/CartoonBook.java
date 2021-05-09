package com.example.demo.domain;


public class CartoonBook {
    private Integer cId;
    private String cName;
    private String cartoonCoverUrl;
    private String cartoonType;
    private String introduction;

    public CartoonBook(Integer cId, String cName, String cartoonCoverUrl, String cartoonType, String introdution) {
        this.cId = cId;
        this.cName = cName;
        this.cartoonCoverUrl = cartoonCoverUrl;
        this.cartoonType = cartoonType;
        this.introduction = introdution;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCartoonCoverUrl() {
        return cartoonCoverUrl;
    }

    public void setCartoonCoverUrl(String cartoonCoverUrl) {
        this.cartoonCoverUrl = cartoonCoverUrl;
    }

    public String getCartoonType() {
        return cartoonType;
    }

    public void setCartoonType(String cartoonType) {
        this.cartoonType = cartoonType;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public CartoonBook() {
    }

    @Override
    public String toString() {
        return "CartoonBook{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cartoonCoverUrl='" + cartoonCoverUrl + '\'' +
                ", cartoonType='" + cartoonType + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
