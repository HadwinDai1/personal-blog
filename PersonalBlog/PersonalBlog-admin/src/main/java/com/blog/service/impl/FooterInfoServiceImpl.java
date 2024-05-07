package com.blog.service.impl;

import com.blog.domain.entity.FooterInfo;
import com.blog.mapper.FooterInfoMapper;
import com.blog.service.FooterInfoService;

import org.springframework.stereotype.Service;

/**
 * 页脚管理服务层
 * @author 2597378587@qq.com 2024/5/7 9:24
 * @version V1.0
 */

@Service
public class FooterInfoServiceImpl implements FooterInfoService {

    private FooterInfoMapper footerInfoMapper;

    public FooterInfoServiceImpl(FooterInfoMapper footerInfoMapper) {
        this.footerInfoMapper = footerInfoMapper;
    }

    /**
     * 查询页脚信息
     * @return 页脚信息
     */
    @Override
    public FooterInfo getFooterInfo() {
        return footerInfoMapper.getFooterInfo();
    }
}
