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
public class Test1Controller {
    @RequestMapping("2")
    public String Test001(){
        return "OK2";
    }


    @RequestMapping("3")
    public String Test002() {
        return "Ok3";
    }
}
