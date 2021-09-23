/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.dingxiang.alarm.example.simple;

import com.dingxiang.alarm.core.entity.AlarmConfig;
import com.dingxiang.alarm.core.execut.SimpleExecuteFactory;
import com.dingxiang.alarm.core.loader.api.IConfLoader;
import com.dingxiang.alarm.core.loader.entity.RegisterInfo;

import java.util.Arrays;
import java.util.Collections;

/**
 * @FileName: SimpleExampleConfLoader.java
 * @Description: SimpleExampleConfLoader.java类说明
 * @Author: bowen.zhang
 * @Date: 2021/9/23 15:17
 */
public class SimpleExampleConfLoader implements IConfLoader {

    @Override
    public RegisterInfo getRegisterInfo() {
        //TODO:从数据库中读取配置
        RegisterInfo registerInfo = new RegisterInfo();
        registerInfo.setMaxAlarmType(100);
        registerInfo.setDefaultAlarmUsers("yihui");
        registerInfo.setAppName("test");
        return registerInfo;
    }

    @Override
    public boolean alarmEnable(String alarmKey) {
        return true;
    }

    @Override
    public AlarmConfig getAlarmConfigOrDefault(String alarmKey) {
        AlarmConfig alarmConfig = new AlarmConfig();
        alarmConfig.setExecutor(SimpleExecuteFactory.getExecute("WEIXIN"));
        alarmConfig.setAutoIncEmergency(false);
        alarmConfig.setMinLimit(10);
        alarmConfig.setMaxLimit(14);
        alarmConfig.setUsers(Arrays.asList("yihui"));
        alarmConfig.setAlarmThreshold(Collections.emptyList());
        return alarmConfig;
    }

    @Override
    public int order() {
        return 0;
    }
}
