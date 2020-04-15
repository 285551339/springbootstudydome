package com.cn.dome.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName AopAspect
 * @Author zangliulu
 * @date 2020.04.14 17:42
 */
@Component
@Aspect
public class AopAspect {

    //切点
    @Pointcut("execution(* com.cn.dome.aop.*.*(..))")
    public void pointCut() {
    }

    //前置通知（Before）：在目标方法被调用之前调用通知功能
    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        //如果需要这里可以取出参数进行处理
        //Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("before aspect executing 方法名称:"+name);
    }

    //后置通知（After）：在目标方法完成之后调用通知，此时不会关心方法的输出是什么
    @After("pointCut()")
    public void after(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("after aspect executed 方法名称:"+name);
    }


    //返回通知（After-returning）：在目标方法成功执行之后调用通知
    @AfterReturning(pointcut = "pointCut()", returning = "returnVal")
    public void afterReturning(JoinPoint joinPoint, Object returnVal) {
        System.out.println("afterReturning executed, return result is "
                + returnVal);
    }

    //环绕通知（Around）：通知包裹了被通知的方法，在被通知的方法调用之前和调用之后执行自定义的行为
//    @Around("pointCut()")
//    public void around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around start..");
//        try {
//            pjp.proceed();
//        } catch (Throwable ex) {
//            System.out.println("error in around");
//            throw ex;
//        }
//        System.out.println("around end");
//    }

    //异常通知（After-throwing）：在目标方法抛出异常后调用通知
    @AfterThrowing(pointcut = "pointCut()", throwing = "error")
    public void afterThrowing(JoinPoint jp, Throwable error) {
        System.out.println("error:" + error);
    }

}
