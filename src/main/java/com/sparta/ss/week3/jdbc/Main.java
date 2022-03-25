package com.sparta.ss.week3.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
//    //Data Access Object
//    //CRUD - Create, Read, Update, Delete
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/employees";
//        String username = "root";
//        String password = "root";
//        try {
//            Connection connection = DriverManager.getConnection(url, username, password);
//            System.out.println("Connected to Database");
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
//        Connection connection = ConnectionManager.getConnection();
//        EmployeesDAO employeesDAO = new EmployeesDAO(connection);
        EmployeesDAO employeesDAO = new EmployeesDAO(ConnectionManager.getConnection());
        employeesDAO.insert(2, "Neil", "neil@gmail.com");
        employeesDAO.printAllEmployees();
        ConnectionManager.closeConnection();
    }
}
