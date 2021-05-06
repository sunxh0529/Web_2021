package com.web.demo.bean.controllerAdvice;

public class CallResultMsg<T> {
    private boolean result;
    private int code;
    private String message;
    private T data;

    public CallResultMsg(boolean result, CodeAndMsg msg, T data) {
        this.result = result;
        this.code = msg.code;
        this.message = msg.msg;
    }
}

