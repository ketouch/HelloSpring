package edu.nustti.aop01;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/16  14:54
 */
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[After]"+target.getClass().getName() + "的( " + method.getName() + " )方法被调用了!");
    }
}
