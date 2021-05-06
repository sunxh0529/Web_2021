package com.web.demo.bean.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = RestController.class)
public class MyControllerAdvice<T> {

    @ResponseStatus(HttpStatus.OK)
    public CallResultMsg sendSuccessResponse(){
        return new CallResultMsg(true, new CodeAndMsg(100, "ok"), null);
    }

    @ResponseStatus(HttpStatus.OK)
    public CallResultMsg sendSuccessResponse(T data) {
        return new CallResultMsg(true, new CodeAndMsg(100, "ok"), data);
    }

}