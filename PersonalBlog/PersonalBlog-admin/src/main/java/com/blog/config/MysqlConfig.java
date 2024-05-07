package com.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * 数据库源的配置
 * @author 2597378587@qq.com 2024/5/6 17:23
 * @version V1.0
 */
@Configuration
public class MysqlConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://8.138.85.189:3306/personal");
        dataSource.setUsername("root");
        dataSource.setPassword("990604dhd");
        return dataSource;
    }
}
