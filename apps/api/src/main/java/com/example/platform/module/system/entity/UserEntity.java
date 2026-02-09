package com.example.platform.module.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("sys_user")
public class UserEntity {

  @TableId(type = IdType.AUTO)
  private Long id;
  private String username;
  private String displayName;
  private String email;
  private Integer status;
  private String createdAt;
  private String updatedAt;
}
