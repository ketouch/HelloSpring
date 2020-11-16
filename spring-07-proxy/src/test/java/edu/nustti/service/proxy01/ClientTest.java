package edu.nustti.service.proxy01;

import org.junit.Test;

/**
 * @author LemonCCC
 * @description 这个测试类对应前面的edu.nustti.proxy包内的内容
 * @create 2020/11/13  11:31
 */
public class ClientTest {
    @Test
    public  void test(){
        HouseOwner owner = new HouseOwner();
        RentalAgency ra = new RentalAgency(owner);
        ra.rentHouse();
    }
}
