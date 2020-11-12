package edu.nustti;

import edu.nustti.config.AppConfig;
import edu.nustti.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  18:02
 */
public class UserTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user.getName());
    }
}
