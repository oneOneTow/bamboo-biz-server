package com.luzhiqing.bamboo.service.impl;

import com.luzhiqing.bamboo.annotation.MongoTransactional;
import com.luzhiqing.bamboo.service.BookInfo;
import com.luzhiqing.bamboo.service.MongoTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;


/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2020/1/4 16:39
 */
@Service
public class MongoTestServiceImpl implements MongoTestService {
    private static final Logger logger = LoggerFactory.getLogger(MongoTestServiceImpl.class);
    @Autowired
   private MongoTemplate mongoTemplate;
    @Override
    @MongoTransactional(rollbackFor = Exception.class)
    public void insert(BookInfo bookInfo) {
        mongoTemplate.insert(bookInfo);
        logger.info("insert ok ！！");
    }
}
