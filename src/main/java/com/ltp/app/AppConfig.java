package com.ltp.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: springdemo
 * @Description: 配置包扫描路径
 * @Author: Ltp
 * @Date: 2020/2/27 16:04
 */
@Configuration
@ComponentScan("com.ltp")
public class AppConfig {
}
