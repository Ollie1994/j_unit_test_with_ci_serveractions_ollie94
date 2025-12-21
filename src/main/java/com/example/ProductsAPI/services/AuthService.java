package com.example.ProductsAPI.services;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AuthService {
    private static final String SECRET = "myjwtsecret";

    MessageDigest md = MessageDigest.getInstance("MD5");

    public AuthService() throws NoSuchAlgorithmException {
    }
}
