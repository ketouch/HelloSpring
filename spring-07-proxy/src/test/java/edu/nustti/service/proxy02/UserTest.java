package edu.nustti.service.proxy02;

import org.junit.Test;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/13  13:35
 */
public class UserTest {
    @Test
    public void test(){
        UserService service = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(service);
        proxy.add();
        proxy.get();
        proxy.delete();
        proxy.update();
    }
}
