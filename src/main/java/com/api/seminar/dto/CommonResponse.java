package com.api.seminar.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResponse<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    private CommonResponse() {}

    private CommonResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> CommonResponse<T> success(String message, T data) {
        return new CommonResponse<T>(0, message, data);
    }

    public static <T> CommonResponse<T> success(String message) {
        return new CommonResponse<T>(0, message, null);
    }

    public static <T> CommonResponse<T> error(String message) {
        return new CommonResponse<T>(-1, message, null);
    }
}
