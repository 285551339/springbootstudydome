package com.cn.thread.admin.rest;

import com.cn.thread.admin.biz.UserBiz;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@Slf4j
@RestController
@RequestMapping("/test")
public class NewUserController {

    @Autowired
    private UserBiz userBiz;


    @GetMapping("/user/get")
    public void getUser() {
        userBiz.saveUser();
    }


}
