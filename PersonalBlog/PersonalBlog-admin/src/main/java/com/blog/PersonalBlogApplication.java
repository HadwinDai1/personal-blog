package com.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * <p>
 * web启动入口
 * </p>
 *
 * @author 2597378587@qq.com 2024/4/27 18:01
 * @version V1.0
 */

//  设置禁止自动配置数据库
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//  开启异步功能
@EnableAsync

public class PersonalBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonalBlogApplication.class, args);
        System.out.println("------>>>>>> 程序启动成功 <<<<<<------\n" +
                " _     _       ___   _       _   __   _\n" +
                "| |   / /     /   | | |     | | |  \\ | |\n" +
                "| |  / /     / /| | | |     | | |   \\| |\n" +
                "| | / /     / / | | | |     | | | |\\   |\n" +
                "| |/ /     / /  | | | |___  | | | | \\  |\n" +
                "|___/     /_/   |_| |_____| |_| |_|  \\_|");
    }
}
