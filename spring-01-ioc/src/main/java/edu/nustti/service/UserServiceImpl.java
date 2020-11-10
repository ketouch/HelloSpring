package edu.nustti.service;

import edu.nustti.dao.UserDAO;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/10  7:57
 */
public class UserServiceImpl implements UserService{
    UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void getUser() {
        userDAO.getUser();
    }
}
