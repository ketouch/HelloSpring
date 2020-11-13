package edu.nustti.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author LemonCCC
 * @description
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
