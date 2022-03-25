package com.sparta.ss.week3.jdbc;

public interface SQLQueries {
    public final String INSERT_INTO_DB = "INSERT INTO `employees`.`employees` (`id`, `user_name`, `email`) VALUES (?,?,?)";
    String SELECT_ALL = "SELECT * FROM employees.employees";
}
