package com.example.demo.dao;

import com.example.demo.domain.Chapter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChapterDao {
    public List<Chapter> getChapters(Integer cId);
}
