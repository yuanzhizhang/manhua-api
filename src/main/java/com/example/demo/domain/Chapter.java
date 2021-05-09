package com.example.demo.domain;


public class Chapter {
    private Integer chapterId;
    private Integer chapterOrderId;
    private Integer cartoonId;
    private String chapterTitle;

    public Chapter() {
    }

    public Chapter(Integer chapterId, Integer chapterOrderId, Integer cartoonId, String chapterTitle) {
        this.chapterId = chapterId;
        this.chapterOrderId = chapterOrderId;
        this.cartoonId = cartoonId;
        this.chapterTitle = chapterTitle;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getChapterOrderId() {
        return chapterOrderId;
    }

    public void setChapterOrderId(Integer chapterOrderId) {
        this.chapterOrderId = chapterOrderId;
    }

    public Integer getCartoonId() {
        return cartoonId;
    }

    public void setCartoonId(Integer cartoonId) {
        this.cartoonId = cartoonId;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "chapterId=" + chapterId +
                ", chapterOrderId=" + chapterOrderId +
                ", cartoonId=" + cartoonId +
                ", chapterTitle='" + chapterTitle + '\'' +
                '}';
    }
}
