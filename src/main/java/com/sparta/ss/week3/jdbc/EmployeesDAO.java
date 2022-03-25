package com.sparta.ss.week3.jdbc;

import java.sql.*;

public class EmployeesDAO {
    private Connection connection;
    private Statement statement;

    public EmployeesDAO(Connection connection) {
        this.connection = connection;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printAllEmployees() {
        try {
            ResultSet resultSet = statement.executeQuery(SQLQueries.SELECT_ALL);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //INSERT INTO `user_db`.`users` (`id`, user_name`, `email`) VALUES (`2`, `Astha`, `Ashaw@spartaglobal.com`);
    public void insert(int id, String username, String email) {
//        statement.executeQuery("INSERT INTO `user_db`.`users` (`id`, user_name`, `email`) VALUES (`2`, `Astha`, `Ashaw@spartaglobal.com`)")
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQueries.INSERT_INTO_DB);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, email);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
