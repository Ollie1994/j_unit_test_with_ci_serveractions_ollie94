package com.example.ProductsAPI.services;

import java.util.Random;

public class UserService {
    String password = "supersecret123";
    String username = "Oliwer";
    Random rand = new Random();
    String query = "SELECT * FROM users WHERE username = '" + username + "'";

    public void sendstuff () {
        System.out.println("Password: " + password);
    }
}
