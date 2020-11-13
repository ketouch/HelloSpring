package edu.nustti.proxy01;

/**
 * @author LemonCCC
 * @description RentalAgency 租房中介，作为房主的代理
 * @create 2020/11/13  11:20
 */
public class RentalAgency implements RentHouse {
    //房屋中介拥有房主，可以代替房主做决定
    private HouseOwner houseOwner;

    public RentalAgency(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    //中介调用房主来出租房屋
    @Override
    public void rentHouse() {
        watchHouse();
        houseOwner.rentHouse();
        signContract();
    }

    //中介夹带私货：1.带客户看房，2.调用户主出租房屋 3.与客户签合同
    //看房
    private void watchHouse() {
        System.out.println("中介带客户看房");
    }

    //签合同
    private void signContract() {
        System.out.println("中介和客户签合同");
    }
}
