package com.example.platform.module.system.service;

import com.example.platform.module.system.dto.UserCreateRequest;
import com.example.platform.module.system.vo.UserVO;
import java.util.List;

public interface UserService {

  List<UserVO> listUsers();

  UserVO getUserById(Long id);

  UserVO createUser(UserCreateRequest request);
}
