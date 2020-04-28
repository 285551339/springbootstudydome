package com.cn.dome.factoryPostProcessor;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName TestLog
 * @Author zangliulu
 * @date 2020.04.28 17:20
 */
@Component
@Data
public class TestLog {
    private Integer logType ;

    public TestLog() {
        System.out.println("TestLog的构建方法");
    }
}
