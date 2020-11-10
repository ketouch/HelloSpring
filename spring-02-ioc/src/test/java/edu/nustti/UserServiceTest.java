package edu.nustti;

import edu.nustti.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/10  9:29
 */
public class UserServiceTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = context.getBean(UserService.class);
        System.out.println(service.getUser());
    }
}
