package com.ltp;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * @ProjectName: springdemo
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/2/27 15:59
 */
public class SpringApplication {
    public static void run() {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        tomcat.addWebapp("/demo","F:\\Ltp\\Tomcat");

        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }
}
