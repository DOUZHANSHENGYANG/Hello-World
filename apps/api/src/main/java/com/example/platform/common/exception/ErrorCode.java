package com.example.platform.common.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
  USER_NOT_FOUND("USER_NOT_FOUND", "User does not exist"),
  VALIDATION_ERROR("VALIDATION_ERROR", "Request validation failed"),
  INTERNAL_ERROR("INTERNAL_ERROR", "Unexpected server error");

  private final String code;
  private final String message;

  ErrorCode(String code, String message) {
    this.code = code;
    this.message = message;
  }
}
