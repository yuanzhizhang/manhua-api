package com.example.demo.response;

import com.example.demo.domain.Chapter;
import lombok.Data;

import java.util.List;

@Data
public class ChapterResponse {
    private String msg;
    private Integer code;
    private List<Chapter> cartoonChapters;

    public ChapterResponse() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Chapter> getCartoonChapters() {
        return cartoonChapters;
    }

    public void setCartoonChapters(List<Chapter> cartoonChapters) {
        this.cartoonChapters = cartoonChapters;
    }
}
