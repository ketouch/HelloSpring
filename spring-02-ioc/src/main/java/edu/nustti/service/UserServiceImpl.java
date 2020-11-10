package edu.nustti.service;

import edu.nustti.dao.UserDAO;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/10  9:25
 */
public class UserServiceImpl implements UserService {

    UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public String getUser() {
        return userDAO.getUser();
    }
}
