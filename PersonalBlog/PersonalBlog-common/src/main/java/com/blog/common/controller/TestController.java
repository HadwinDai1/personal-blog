package com.blog.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * description
 * </p>
 *
 * @author 2597378587@qq.com 2024/4/30 9:08
 * @version V1.0
 */

@RestController
@RequestMapping()
public class TestController {
    @RequestMapping("1")
    public String Test001(){
        return "OK1";
    }
}
