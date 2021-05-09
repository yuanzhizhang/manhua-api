package com.example.demo.response;

import com.example.demo.domain.CartoonBook;


public class CartoonResponse {
    private String msg;
    private Integer code;
    private CartoonBook cartoonBook;

    public CartoonResponse() {
    }

    public CartoonResponse(String msg, Integer code, CartoonBook cartoonBook) {
        this.msg = msg;
        this.code = code;
        this.cartoonBook = cartoonBook;
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

    public CartoonBook getCartoonBook() {
        return cartoonBook;
    }

    public void setCartoonBook(CartoonBook cartoonBook) {
        this.cartoonBook = cartoonBook;
    }
}
