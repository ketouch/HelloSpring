package edu.nustti.service.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  18:00
 */
@Component
public class User {
    @Value(value = "张小盟")
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
