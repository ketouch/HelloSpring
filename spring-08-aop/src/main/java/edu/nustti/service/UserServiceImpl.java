package edu.nustti.service;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/16  14:46
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
        System.out.println("更新用户");
    }

    @Override
    public void find() {
        System.out.println("查找用户");
    }
}
