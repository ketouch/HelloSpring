package edu.nustti.service;

import edu.nustti.service.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/**
 * @author LemonCCC
 * @description 测试c和p空间
 * @create 2020/11/12  10:38
 */
public class UserTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        User user1 = context.getBean("user1", User.class);
        System.out.println(user1);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user2);

        //Environment environment = user1.getEnvironment();
    }
}
