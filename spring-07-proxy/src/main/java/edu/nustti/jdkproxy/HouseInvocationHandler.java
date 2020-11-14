package edu.nustti.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LemonCCC
 * @description  InvocationHandler是一个函数式接口，用来处理实际代理类执行的动作
 *                该接口在通用的对象代理类ObjectProxy中通过Lambda表达式实现了，所以这里可以不用定义
 * @create 2020/11/13  14:19
 */
public class HouseInvocationHandler implements InvocationHandler {
    private Object target;


    public HouseInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RentalAgency.watchHouse();
        Object obj = method.invoke(target, args);
        RentalAgency.signContract();
        return obj;
    }
}
