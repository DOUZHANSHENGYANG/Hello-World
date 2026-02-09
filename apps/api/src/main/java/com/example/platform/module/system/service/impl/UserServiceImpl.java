package com.example.platform.module.system.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.platform.common.exception.BusinessException;
import com.example.platform.common.exception.ErrorCode;
import com.example.platform.module.system.dto.UserCreateRequest;
import com.example.platform.module.system.entity.UserEntity;
import com.example.platform.module.system.mapper.UserMapper;
import com.example.platform.module.system.service.UserService;
import com.example.platform.module.system.vo.UserVO;
import java.time.OffsetDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

  private final UserMapper userMapper;

  public UserServiceImpl(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @Override
  public List<UserVO> listUsers() {
    return userMapper.selectList(Wrappers.<UserEntity>lambdaQuery().orderByDesc(UserEntity::getId))
        .stream()
        .map(this::toVo)
        .toList();
  }

  @Override
  public UserVO getUserById(Long id) {
    UserEntity entity = userMapper.selectById(id);
    if (entity == null) {
      throw new BusinessException(ErrorCode.USER_NOT_FOUND);
    }
    return toVo(entity);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public UserVO createUser(UserCreateRequest request) {
    UserEntity entity = new UserEntity();
    entity.setUsername(request.getUsername());
    entity.setDisplayName(request.getDisplayName());
    entity.setEmail(request.getEmail());
    entity.setStatus(1);

    String now = OffsetDateTime.now().toString();
    entity.setCreatedAt(now);
    entity.setUpdatedAt(now);

    userMapper.insert(entity);
    return toVo(entity);
  }

  private UserVO toVo(UserEntity entity) {
    return UserVO.builder()
        .id(entity.getId())
        .username(entity.getUsername())
        .displayName(entity.getDisplayName())
        .email(entity.getEmail())
        .status(entity.getStatus())
        .build();
  }
}
