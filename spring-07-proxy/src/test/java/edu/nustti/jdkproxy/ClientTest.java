package edu.nustti.jdkproxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/13  21:23
 */
public class ClientTest {
    @Test
    public void test() {
        HouseOwner houseOwner = new HouseOwner();
        RentHouse proxy = (RentHouse) HouseOwnerProxy.getHouseOwnerProxy(houseOwner);
        proxy.rentHouse();
    }
}
