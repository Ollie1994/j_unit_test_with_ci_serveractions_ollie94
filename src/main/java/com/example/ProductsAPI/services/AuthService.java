package com.example.ProductsAPI.services;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AuthService {
    private static final String SECRET = "myjwtsecret";
    String awsKey = "AKIA123456789EXAMPLE";
    String awsSecret = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";
    MessageDigest md = MessageDigest.getInstance("MD5");
    String username = "admin";
    String query = "SELECT * FROM users WHERE username = '" + username + "'";

    public AuthService() throws NoSuchAlgorithmException {
    }
}
