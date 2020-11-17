package edu.nustti.aop01;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author LemonCCC
 * @description 前置方法
 * @create 2020/11/16  14:48
 */
public class BeforeLog implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[Before]"+target.getClass().getName() + "的( " + method.getName() + " )方法被调用了!");
    }
}
