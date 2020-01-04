package com.luzhiqing.bamboo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.MongoTransactionManager;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2020/1/4 17:09
 */
@Configuration
public class MongodbConfig {
    @Bean("mongoTransactionManager")
    MongoTransactionManager mongoTransactionManager(MongoDbFactory dbFactory) {
        return new MongoTransactionManager(dbFactory);
    }
}
