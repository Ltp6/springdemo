package com.ltp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: springdemo
 * @Description: TODO
 * @Author: Ltp
 * @Date: 2020/2/27 16:07
 */
@Controller
public class TestController {
    @RequestMapping("/index.do")
    public void index(){
        System.out.println("-----------");
    }
}
