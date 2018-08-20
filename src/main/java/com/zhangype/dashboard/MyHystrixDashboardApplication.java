package com.zhangype.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hystrix 仪表盘启动类
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/8/20
 */
@EnableHystrixDashboard
@SpringBootApplication
public class MyHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyHystrixDashboardApplication.class, args);
    }
}
