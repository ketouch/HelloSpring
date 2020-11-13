package edu.nustti;

import edu.nustti.config.AppConfig;
import edu.nustti.entity.Student;
import edu.nustti.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  18:02
 */
public class AppConfigTest {

    @Test
    public void test(){
        //使用配置类的方式，就需要使用AnnotationConfigApplicationContext来读取配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user.toString());
        Student student = context.getBean("student",Student.class);//根据方法名获取
        System.out.println(student.toString());
    }
}
