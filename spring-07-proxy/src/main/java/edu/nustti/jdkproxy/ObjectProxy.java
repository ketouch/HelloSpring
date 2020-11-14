package edu.nustti.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author LemonCCC
 * @description 通用对象代理类
 * @create 2020/11/13  11:18
 */
public class ObjectProxy {
    /**
     * @param target 需要代理的对象
     * @return 返回代理对象
     */
    public static Object getProxyInstance(Object target) {
        /**
         * $$内部类形式
         * InvocationHandler handler = new InvocationHandler() {
         *             @Override
         *             public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         *                 RentalAgency.watchHouse();
         *                 Object obj = method.invoke(target, args);
         *                 RentalAgency.signContract();
         *                 return obj;
         *             }
         *         };
         * ========================
         * $$以下为Lambda表达式形式
         */
        InvocationHandler handler = (proxy, method, args) -> {
            RentalAgency.watchHouse(); //前置操作
            Object obj = method.invoke(target, args);
            RentalAgency.signContract();//后置操作
            return obj;
        };
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
    }
}
