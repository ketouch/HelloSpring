package edu.nustti.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  18:00
 */
@Controller
public class User {
    @Value(value = "abc")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
