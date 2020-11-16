package edu.nustti.service.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  15:07
 */
@Component //等价于<bean id="dao" class="edu.nustti.dao.UserDAO"/>
public class UserDAO {

    @Value(value = "userDAO") //等价于<property name="name" value="userDAO"/>
    public String name;

    public void show() {
        System.out.println("显示用户信息!");
    }
}
