package com.example.demo.service;

import com.example.demo.domain.CartoonBook;

import java.util.List;

public interface CartoonBookService {

    public List<CartoonBook> getAllCartoonBooks(String cartoonType);

    public CartoonBook getOneCartoonBook(int cId);
}
