package edu.nustti.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author LemonCCC
 * @description 房屋主人，出租房屋
 * @create 2020/11/13  11:18
 */
public class HouseOwnerProxy {
    public static Object getHouseOwnerProxy(Object target){
        HouseInvocationHandler handler = new HouseInvocationHandler(target);
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),handler);
        return proxy;
    }
}
