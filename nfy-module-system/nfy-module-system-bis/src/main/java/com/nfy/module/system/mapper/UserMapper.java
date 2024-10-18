package com.nfy.module.system.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nfy.framework.common.pojo.PageResult;
import com.nfy.framework.mybatis.mapper.BaseMapperX;
import com.nfy.module.system.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapperX<User> {

}
