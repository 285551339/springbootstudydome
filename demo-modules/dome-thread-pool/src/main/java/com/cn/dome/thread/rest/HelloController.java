package com.cn.dome.thread.rest;

import com.cn.dome.thread.biz.ThreadBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @ClassName HelloController
 * @Author zangliulu
 * @date 2020.05.15 11:12
 */
@RestController
@RequestMapping("/test")
public class HelloController {
    @Autowired
    private ThreadBiz threadBiz;

    @GetMapping("hello")
    public void getHello(){
        System.out.printf("你好 ！！！！！！！！！");
        threadBiz.getCoerPoolSize();
        threadBiz.setCoerPoolSize(20);
        threadBiz.getCoerPoolSize();
    }



}
