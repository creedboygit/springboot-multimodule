package com.valletta.moduleapi.exceptionhandler;

import com.valletta.moduleapi.exception.CustomException;
import com.valletta.moduleapi.response.CommonResponse;
import com.valletta.modulecommon.enums.CodeEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public CommonResponse<String> handlerCustomException(CustomException e) {
        return CommonResponse.<String>builder()
            .returnCode(e.getReturnCode())
            .returnMessage(e.getReturnMessage())
            .build();
    }

    @ExceptionHandler(Exception.class)
    public CommonResponse<String> handlerException(Exception e) {
        return CommonResponse.<String>builder()
            .returnCode(CodeEnum.UNKNOWN_ERROR.getCode())
            .returnMessage(CodeEnum.UNKNOWN_ERROR.getMessage())
            .build();
    }
}
