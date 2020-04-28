package com.cn.dome.aop;

import org.springframework.stereotype.Service;

import java.beans.Transient;

/**
 * @Description
 * @ClassName AspectService
 * @Author zangliulu
 * @date 2020.04.14 18:54
 */

@Service
public class AspectService {

    @Transient
    public void doSomeThing(String name, String adder) {
        System.out.println("name:"+name+"adder:"+adder);
        int i= 1/0;
    }

}
