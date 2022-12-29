package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserServiceImpl implements UserService {
    //private final UserDaoJDBCImpl userDaoJDBC;
    private final UserDao userDao;
    public UserServiceImpl() {
        //this.userDaoJDBC = new UserDaoJDBCImpl();
        this.userDao = new UserDaoHibernateImpl();
    }
    public void createUsersTable() {
        //this.userDaoJDBC.createUsersTable();
        this.userDao.createUsersTable();
    }

    public void dropUsersTable() {
        //this.userDaoJDBC.dropUsersTable();
        this.userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        //this.userDaoJDBC.saveUser(name, lastName, age);
        this.userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        //this.userDaoJDBC.removeUserById(id);
        this.userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        //return userDaoJDBC.getAllUsers();
        return this.userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        //this.userDaoJDBC.cleanUsersTable();
        this.userDao.cleanUsersTable();
    }
}
