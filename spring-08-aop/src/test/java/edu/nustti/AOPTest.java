package edu.nustti;

import edu.nustti.service.UserService;
import edu.nustti.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/16  15:03
 */
public class AOPTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //注意：动态代理代理的是接口
        UserService service = context.getBean("userService", UserService.class);
        service.add();
    }
}
