package com.example.platform.module.system.vo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserVO {
  private Long id;
  private String username;
  private String displayName;
  private String email;
  private Integer status;
}
