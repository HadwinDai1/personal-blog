package com.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  用户控制类
 * </p>
 *
 * @author 2597378587@qq.com 2024/4/27 18:53
 * @version V1.0
 */

@RestController
@RequestMapping()
public class SysUserController {

    @GetMapping("123")
    public String Test01(){
        return "Ok";
    }
}
