package com.example.demo.dao;

import com.example.demo.domain.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PageDao {
    public List<Page> getPages(Integer chapterId);
}
