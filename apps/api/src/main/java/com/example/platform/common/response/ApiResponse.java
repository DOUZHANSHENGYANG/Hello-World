package com.example.platform.common.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiResponse<T> {

  private final String code;
  private final String message;
  private final T data;

  public static <T> ApiResponse<T> success(T data) {
    return ApiResponse.<T>builder()
        .code("SUCCESS")
        .message("ok")
        .data(data)
        .build();
  }

  public static <T> ApiResponse<T> failure(String code, String message) {
    return ApiResponse.<T>builder()
        .code(code)
        .message(message)
        .data(null)
        .build();
  }
}
