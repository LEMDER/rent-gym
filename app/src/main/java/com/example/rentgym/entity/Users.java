package com.example.rentgym.entity;

public class Users {
    String name;
    String email;
    String password;
    String passwordAgain;

    public Users(String name, String email, String password, String passwordAgain) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.passwordAgain = passwordAgain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordAgain() {
        return passwordAgain;
    }

    public void setPasswordAgain(String passwordAgain) {
        this.passwordAgain = passwordAgain;
    }
}
