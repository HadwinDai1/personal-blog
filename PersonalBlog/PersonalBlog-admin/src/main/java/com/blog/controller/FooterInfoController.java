package com.blog.controller;

import com.blog.domain.entity.FooterInfo;
import com.blog.service.FooterInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * description
 * </p>
 *
 * @author 2597378587@qq.com 2024/5/7 9:13
 * @version V1.0
 */

@RestController
@RequestMapping("/footer")
public class FooterInfoController {

    private final FooterInfoService footerInfoService;

    public FooterInfoController(FooterInfoService footerInfoService) {
        this.footerInfoService = footerInfoService;
    }

    @GetMapping("/info")
    public FooterInfo GetFooterInfo() {
        return footerInfoService.getFooterInfo();
    }

}
