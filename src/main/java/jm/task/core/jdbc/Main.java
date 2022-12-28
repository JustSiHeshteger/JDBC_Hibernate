package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Hello", "World", (byte)56);
        userService.saveUser("Goodbye", "World", (byte)13);

        userService.getAllUsers().stream().forEach(element -> System.out.println(element.toString()));

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
