package com.blog.mapper;

import com.blog.domain.entity.FooterInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 2597378587@qq.com 2024/5/7 9:34
 * @version V1.0
 */

public interface FooterInfoMapper {
    /**
     * 查询页脚信息
     * @return 页脚信息
     */
    FooterInfo getFooterInfo();

}
