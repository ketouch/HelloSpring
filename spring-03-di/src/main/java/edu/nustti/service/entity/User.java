package edu.nustti.service.entity;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author LemonCCC
 * @description p命名空间和c命名空间
 * p命名空间代表<property></property>标签，对应类中set方法
 * c命名空间代表<constructor-arg></constructor-arg>标签，对应类的带参构造方法
 * @create 2020/11/12  11:19
 */
public class User implements EnvironmentAware {
    private String name;
    private Integer age;
    private Environment environment;
    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Environment getEnvironment() {
        return environment;
    }
}
