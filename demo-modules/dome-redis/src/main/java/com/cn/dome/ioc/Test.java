package com.cn.dome.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @Description
 * @ClassName Test
 * @Author zangliulu
 * @date 2020.04.14 14:37
 */
public class Test {

    public static void main(String[] args) {
        /*System.out.println("1111111111111111111");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestConfig.class);
        ctx.getBean(DogBiz.class);
        String s ="111";
        System.out.println("22222222222222222222");*/
        //String [] strs = {"flower","flow","flight"};
        //System.out.println(longMaxStr(strs));
        Integer i = null;
        System.out.println("1".equals(i));
        System.out.println(i.equals(1));


    }

    public static String longMaxStr(String [] strs){
        if (strs.length == 0) {return "";}
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {return "";}
            }
        }

        return prefix;
    }
}
