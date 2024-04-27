package com.blog.common.utils;/**
 * <p>
 * description
 * </p>
 *
 * @author 2597378587@qq.com 2024/4/27 19:28
 * @version V1.0
 */
public class StringUtils {

    /**
     * * 判断一个对象是否为空
     *
     * @param object Object
     * @return true：为空 false：非空
     */
    public static boolean isNull(Object object) {
        return object == null;
    }

    /**
     * * 判断一个对象是否非空
     *
     * @param object Object
     * @return true：非空 false：空
     */
    public static boolean isNotNull(Object object) {
        return !isNull(object);
    }
}
