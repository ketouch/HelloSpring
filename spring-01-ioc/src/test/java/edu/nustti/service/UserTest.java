package edu.nustti.service;

import edu.nustti.service.dao.UserDAOImpl;
import edu.nustti.service.service.UserService;
import edu.nustti.service.service.UserServiceImpl;
import org.junit.Test;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/10  7:59
 */
public class UserTest {

    @Test
    public void testService(){
        UserService service = new UserServiceImpl();
        ((UserServiceImpl) service).setUserDAO(new UserDAOImpl());
        service.getUser();
    }

}
