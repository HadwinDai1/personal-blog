package com.blog.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * description
 * </p>Q
 *
 * @author 2597378587@qq.com 2024/4/30 9:08
 * @version V1.0
 */

@RestController
@RequestMapping("")
public class Test2Controller {
    @RequestMapping("4")
    public String Test004(){
        return "OK4";
    }
}
