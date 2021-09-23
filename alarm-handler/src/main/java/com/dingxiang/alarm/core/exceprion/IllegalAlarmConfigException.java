package com.dingxiang.alarm.core.exceprion;

/**
 * Created by yihui on 2018/2/7.
 */
public class IllegalAlarmConfigException extends RuntimeException {

    public IllegalAlarmConfigException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
