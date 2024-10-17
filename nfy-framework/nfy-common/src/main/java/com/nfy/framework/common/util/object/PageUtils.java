package com.nfy.framework.common.util.object;


import com.nfy.framework.common.pojo.PageParam;

/**
 * {@link com.nfy.framework.common.pojo.PageParam} 工具类
 */
public class PageUtils {

    public static int getStart(PageParam pageParam) {
        return (pageParam.getPageNo() - 1) * pageParam.getPageSize();
    }

}
