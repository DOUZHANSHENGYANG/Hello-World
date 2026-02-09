package com.example.platform.module.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.platform.module.system.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
