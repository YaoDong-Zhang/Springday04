package com.dfby.advice;

import com.dfby.component.ProductImpl;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @program: Springday04
 * @Date: 2018/9/6 16:25
 * @Author: Mr.Zhang
 * @Description:
 */
public class MineAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("----------------前置通知------------------");
        System.out.println(method.getName());
        for (Object arg: args){
            System.out.println(arg);
        }
        System.out.println(target.getClass());
        ProductImpl productucimpl = (ProductImpl)target;
    }
}
