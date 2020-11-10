package edu.nustti;

import edu.nustti.dao.UserDAOImpl;
import edu.nustti.service.UserService;
import edu.nustti.service.UserServiceImpl;
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
