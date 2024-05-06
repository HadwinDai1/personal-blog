package com.blog.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * description
 * </p>
 *
 * @author 2597378587@qq.com 2024/4/30 13:57
 * @version V1.0
 */
@RestController
@RequestMapping()
public class Test04Controller {
    @RequestMapping("5")
    public String Test05(){
        return "OK5";
    }
}
