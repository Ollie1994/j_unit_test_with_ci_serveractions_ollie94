package com.example.ProductsAPI.services;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

public class UserService {
    String password = "supersecret123";
    Random rand = new Random();
    String username = "admin";
    String query = "SELECT * FROM users WHERE username = '" + username + "'";
    Connection connection;

    public void sendstuff () throws SQLException {
        System.out.println("Password: " + password);
        Statement stmt = (Statement) connection.createStatement();
    }
}
