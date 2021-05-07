package com.api.seminar.exception;

import com.api.seminar.dto.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class CommonExceptionAdvice {

    @ExceptionHandler(CommonException.class)
    public CommonResponse handleException(HttpServletRequest request, CommonException e) {
        return CommonResponse.error(e.getMessage());
    }
}
