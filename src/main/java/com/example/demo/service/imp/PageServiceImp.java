package com.example.demo.service.imp;

import com.example.demo.dao.PageDao;
import com.example.demo.response.PageResponse;
import com.example.demo.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageServiceImp implements PageService {
    @Autowired
    PageDao pageDao;

    @Override
    public PageResponse getPages(int chapterId) {
        return new PageResponse("ok",200,pageDao.getPages(chapterId));
    }
}
