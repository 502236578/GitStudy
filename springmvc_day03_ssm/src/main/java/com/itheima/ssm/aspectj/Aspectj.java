package com.itheima.ssm.aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspectj {
    @Pointcut("execution(* com.itheima.ssm.controller.*(..))")
    public void before(){};

    @Before("before()")
    public void before1(){
        System.out.println("前置通知----order2");
    }
    @After("execution(* com.itheima.ssm.controller.*(..))")
    public void after(){
        System.out.println("后置通知----order1");
    }
}
