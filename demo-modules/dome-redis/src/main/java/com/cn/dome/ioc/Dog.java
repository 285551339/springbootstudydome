package com.cn.dome.ioc;

import lombok.Data;

/**
 * @Description
 * @ClassName Dog
 * @Author zangliulu
 * @date 2020.04.14 14:51
 */
@Data
public class Dog {

    public Dog() {
        System.out.println("dog...Bean+++++++++++++++");
    }

    private String  name;

}
