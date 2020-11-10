package edu.nustti;

import edu.nustti.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/10  9:29
 */
public class UserTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean(User.class);
        System.out.println(user.getName());
    }
}
