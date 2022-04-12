package com.api.seminar.advice;

import com.api.seminar.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public ResultVO<String> handleException(HttpServletRequest request, Exception e) {
        ResultVO<String> result = new ResultVO<>(-1, e.getMessage(), null);
        log.error("{}: {}", request.getRequestURI(), e.getMessage());
        return result;
    }
}
