package com.dingxiang.alarm.core.exceprion;

/**
 * Created by yihui on 2018/2/6.
 */
public class RegisterInfoIllegalException extends RuntimeException {
    public RegisterInfoIllegalException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
