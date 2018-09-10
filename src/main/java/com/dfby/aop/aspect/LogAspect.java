package com.dfby.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;


/**
 * @program: Springday04
 * @Date: 2018/9/7 15:40
 * @Author: Mr.Zhang
 * @Description:
 */
@Aspect
public class LogAspect {
    @Pointcut(value="execution(* com.dfby.aop.component.EntityDao.*(..))")
    private void performance() {
    }

    @Before(value = "performance()")
    public void beforeAdvice(JoinPoint joinPoint) throws Exception{
        System.out.println("-----前置通知-----");
        String methodName=joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        String target = joinPoint.getTarget().toString();
        System.out.println(methodName+"\t"+args+"\t"+target);
    }
    @AfterReturning(value = "performance()",returning = "retValue")
    public void afterAdvice(JoinPoint joinPoint,Object retValue){
        System.out.println("-----返回值通知-----");
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("args:"+args);
        System.out.println("执行结果:"+retValue);
    }
}
