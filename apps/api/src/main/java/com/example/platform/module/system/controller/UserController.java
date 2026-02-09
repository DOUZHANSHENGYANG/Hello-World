package com.example.platform.module.system.controller;

import com.example.platform.common.response.ApiResponse;
import com.example.platform.module.system.dto.UserCreateRequest;
import com.example.platform.module.system.service.UserService;
import com.example.platform.module.system.vo.UserVO;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public ApiResponse<List<UserVO>> listUsers() {
    return ApiResponse.success(userService.listUsers());
  }

  @GetMapping("/{id}")
  public ApiResponse<UserVO> getUserById(@PathVariable Long id) {
    return ApiResponse.success(userService.getUserById(id));
  }

  @PostMapping
  public ApiResponse<UserVO> createUser(@Valid @RequestBody UserCreateRequest request) {
    return ApiResponse.success(userService.createUser(request));
  }
}
