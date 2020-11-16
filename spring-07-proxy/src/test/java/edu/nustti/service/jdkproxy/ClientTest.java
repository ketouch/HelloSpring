package edu.nustti.service.jdkproxy;

import org.junit.Test;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/13  21:23
 */
public class ClientTest {
    @Test
    public void test() {
        HouseOwner houseOwner = new HouseOwner();
        Object proxy = ObjectProxy.getProxyInstance(houseOwner);
        ((RentHouse) proxy).rentHouse();
    }
}
