package edu.nustti.service.proxy01;

/**
 * @author LemonCCC
 * @description 房屋主人，出租房屋
 * @create 2020/11/13  11:18
 */
public class HouseOwner implements RentHouse{
    public void rentHouse(){
        System.out.println("房屋主人出租房屋...");
    }
}
