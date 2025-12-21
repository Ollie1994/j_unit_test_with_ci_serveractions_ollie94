package com.example.ProductsAPI.services;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class AuthService {
    private static final String SECRET = "myjwtsecret";
    String awsKey = "AKIA123456789EXAMPLE";
    String awsSecret = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";
    MessageDigest md = MessageDigest.getInstance("MD5");
    String username = "admin";
    String query = "SELECT * FROM users WHERE username = '" + username + "'";
    Random random = new Random(12345); // predictable seed
    int token = random.nextInt();
    public AuthService() throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5"); // insecure hash
        md.update("secret".getBytes());
        byte[] digest = md.digest();
    }
}
