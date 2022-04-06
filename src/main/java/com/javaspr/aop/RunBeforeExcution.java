package com.javaspr.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class RunBeforeExcution  implements MethodBeforeAdvice {
    @Override
    public void before(Method methodOrg, Object[] args, Object target) throws Throwable {
        System.out.println("Inside RunBeforeExecution.before() method...");
        System.out.println("Running before advice...");
    }

}
