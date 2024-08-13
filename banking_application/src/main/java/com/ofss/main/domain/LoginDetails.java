package com.ofss.main.domain;

public class LoginDetails {
    private String username;
    private String passwrd;
    private int loginAttempts;
    private String status;
    private int customerId;
    
    public LoginDetails() {
        System.out.println("Default constructor for LoginDetails");
    }

    public LoginDetails(String username, String passwrd, int loginAttempts, String status, int customerId) {
        this.username = username;
        this.passwrd = passwrd;
        this.loginAttempts = loginAttempts;
        this.status = status;
        this.customerId = customerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    
}
