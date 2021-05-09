package com.example.demo.domain;

public class Page {
    private Integer pageID;
    private String imageUrl;
    private Integer pageOrderId;

    public Page() {
    }

    public Page(Integer pageID, String imageUrl, Integer pageOrderId) {
        this.pageID = pageID;
        this.imageUrl = imageUrl;
        this.pageOrderId = pageOrderId;
    }

    public Integer getPageID() {
        return pageID;
    }

    public void setPageID(Integer pageID) {
        this.pageID = pageID;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getPageOrderId() {
        return pageOrderId;
    }

    public void setPageOrderId(Integer pageOrderId) {
        this.pageOrderId = pageOrderId;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageID=" + pageID +
                ", imageUrl='" + imageUrl + '\'' +
                ", pageOrderId=" + pageOrderId +
                '}';
    }
}
