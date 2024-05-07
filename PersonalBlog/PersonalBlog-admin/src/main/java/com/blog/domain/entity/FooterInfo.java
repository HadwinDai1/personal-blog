package com.blog.domain.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 * description
 * </p>
 *
 * @author 2597378587@qq.com 2024/5/7 9:15
 * @version V1.0
 */

@TableName("blog_footer_info")
public class FooterInfo {

    private String author;
    private String icpNumber;
    private String policeNumber;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIcpNumber() {
        return icpNumber;
    }

    public void setIcpNumber(String icpNumber) {
        this.icpNumber = icpNumber;
    }

    public String getPoliceNumber() {
        return policeNumber;
    }

    public void setPoliceNumber(String policeNumber) {
        this.policeNumber = policeNumber;
    }
}
