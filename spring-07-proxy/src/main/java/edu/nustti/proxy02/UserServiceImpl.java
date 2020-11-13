package edu.nustti.proxy02;

/**
 * @author LemonCCC
 * @description
 *      如果要求每次调用方法之前需要打印日志：
 *          方法1：为每一个方法添加打印日志方法
 *          方法2：使用代理类
 * @create 2020/11/13  13:28
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void get() {
        System.out.println("查询用户");
    }
}
