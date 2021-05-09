package com.example.demo.response;

import com.example.demo.domain.Page;
import lombok.Data;

import java.util.List;

@Data
public class PageResponse {
    private String msg;
    private Integer code;
    private List<Page> pages;

    public PageResponse(String msg, Integer code, List<Page> pages) {
        this.msg = msg;
        this.code = code;
        this.pages = pages;
    }

    public PageResponse() {
    }
}
