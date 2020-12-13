package edu.nustti.service.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/13  9:21
 */
@Component
public class Student {
    @Value("王同学")
    private String name;
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
