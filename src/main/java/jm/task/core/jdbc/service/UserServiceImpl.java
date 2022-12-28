package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDaoJDBCImpl userDaoJDBC;
    //private final UserDaoJDBCImpl userDaoHibernate;
    public UserServiceImpl() {
        this.userDaoJDBC = new UserDaoJDBCImpl();
        //this.userDaoHibernate = new UserDaoHibernateImpl();
    }
    public void createUsersTable() {
        this.userDaoJDBC.createUsersTable();
        //this.userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {
        this.userDaoJDBC.dropUsersTable();
        //this.userDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        this.userDaoJDBC.saveUser(name, lastName, age);
        //this.userDaoHibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        this.userDaoJDBC.removeUserById(id);
        //this.userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoJDBC.getAllUsers();
        //return this.userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() {
        this.userDaoJDBC.cleanUsersTable();
        //this.userDaoHibernate.cleanUsersTable();
    }
}
