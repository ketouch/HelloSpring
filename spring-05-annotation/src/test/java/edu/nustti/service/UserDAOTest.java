package edu.nustti.service;

import edu.nustti.service.dao.UserDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/12  15:09
 */
public class UserDAOTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDAO dao = context.getBean(UserDAO.class);
        dao.show();
    }
}
