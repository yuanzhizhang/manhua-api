package com.example.demo;

import com.example.demo.dao.ChapterDao;
import com.example.demo.dao.PageDao;
import com.example.demo.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManhuaApiApplicationTests {
    @Autowired
    UserDao userDao;

    @Autowired
    ChapterDao chapterDao;

    @Autowired
    PageDao pageDao;

    @Test
    void contextLoads() {
    }

    @Test
    void testDao(){
        System.out.println(userDao.selectOne("zyz"));
    }

    @Test
    void testChapter(){
        System.out.println(chapterDao.getChapters(1));
    }

    @Test
    void testPageDao(){
        System.out.println(pageDao.getPages(1));
    }

}
