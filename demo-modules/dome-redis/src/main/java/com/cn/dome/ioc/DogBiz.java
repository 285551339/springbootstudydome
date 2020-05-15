package com.cn.dome.ioc;

import org.springframework.stereotype.Service;

/**
 * @Description
 * @ClassName DogBiz
 * @Author zangliulu
 * @date 2020.04.15 19:46
 */
@Service
public class DogBiz {

    public void  getName(){
        System.out.println("我的名字叫旺财");
    }
}
