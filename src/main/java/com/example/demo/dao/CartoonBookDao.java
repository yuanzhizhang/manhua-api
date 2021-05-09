package com.example.demo.dao;


import com.example.demo.domain.CartoonBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartoonBookDao {
    public List<CartoonBook> getAllCartoonBooks(String cartoonType);

    public CartoonBook getOneCartoonBook(int cId);
}
