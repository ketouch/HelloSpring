package edu.nustti.proxy02;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/13  13:30
 */
public class UserServiceProxy implements UserService {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void get() {
        log("get");
        userService.get();
    }

    //打印日志方法
    private void log(String method) {
        System.out.println("使用了" + method + "方法！");
    }
}
