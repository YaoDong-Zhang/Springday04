package com.dfby.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @program: Springday04
 * @Date: 2018/9/6 16:47
 * @Author: Mr.Zhang
 * @Description:
 */
public class MineAfterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

    }
}
