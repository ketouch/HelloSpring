package edu.nustti.pojo;

import java.io.Serializable;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/10  9:00
 */
public class User implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
