/*
 * Copyright: 2021 dingxiang-inc.com Inc. All rights reserved.
 */

package com.example.alarmrecevicer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: AlarmListener.java
 * @Description: AlarmListener.java类说明
 * @Author: bowen.zhang
 * @Date: 2021/9/23 11:39
 */
@RestController
public class AlarmListener {
    @GetMapping("/healthCheck")
    public boolean healthCheck(){
        return true;
    }
}
