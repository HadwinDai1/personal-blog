package com.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.sql.DataSource;

/**
 * web启动入口
 * @author 2597378587@qq.com 2024/4/27 18:01
 * @version V1.0
 */

//  设置禁止自动配置数据库
@SpringBootApplication
//  开启异步功能
@EnableAsync
//  kai
@MapperScan("com.blog.mapper")
public class PersonalBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonalBlogApplication.class, args);
        System.out.println("------>>>>>> 程序启动成功 <<<<<<------");
    }
}
