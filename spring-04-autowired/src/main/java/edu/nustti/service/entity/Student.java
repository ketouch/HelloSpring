package edu.nustti.service.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  14:15
 */
public class Student {
    //默认根据类型查找,如果存在多个类型相同的bean的配置，那么就会出错，这时候就可以通过name属性来设置
    @Resource(name = "teacher123")
    private Teacher teacher;

    @Autowired//这个比较常用
    //使用这个注解可以对应xml文件中配置的不同的名字，如果不配置这个注解，那么默认是找与变量同名的bean id
    @Qualifier(value = "clazz123")
    private Clazz clazz;

    public void show(){
        teacher.introduce();
        clazz.introduce();
    }
}
