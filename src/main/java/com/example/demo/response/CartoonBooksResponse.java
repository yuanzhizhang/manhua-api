package com.example.demo.response;

import com.example.demo.domain.CartoonBook;
import lombok.Data;

import java.util.List;

@Data
public class CartoonBooksResponse {
    private String msg;
    private Integer code;
    private List<CartoonBook> cartoonBooks;

    public CartoonBooksResponse() {
    }

    public CartoonBooksResponse(String msg, Integer code, List<CartoonBook> cartoonBooks) {
        this.msg = msg;
        this.code = code;
        this.cartoonBooks = cartoonBooks;
    }
}
