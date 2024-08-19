package com.ofss.main.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login_details")
public class LoginDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "login_details_id")
	private int loginDetailsId;
	
	@Column(name = "username")
    private String username;
	
	@Column(name = "passwrd")
    private String passwrd;
	
	@Column(name = "login_attempts")
    private int loginAttempts;
	
	@Column(name = "status")
    private String status;
	
	@Column(name = "customer_id")
    private int customerId;
    
    public LoginDetails() {
        System.out.println("Default constructor for LoginDetails");
    }

//    public LoginDetails(int loginDetailsId, String username, String passwrd, int loginAttempts, String status, int customerId) {
//        this.loginDetailsId = loginDetailsId;
//    	this.username = username;
//        this.passwrd = passwrd;
//        this.loginAttempts = loginAttempts;
//        this.status = status;
//        this.customerId = customerId;
//    }

    public int getLoginDetailsId() {
		return loginDetailsId;
	}

	public void setLoginDetailsId(int loginDetailsId) {
		this.loginDetailsId = loginDetailsId;
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

	@Override
	public String toString() {
		return "LoginDetails [loginDetailsId=" + loginDetailsId + ", username=" + username + ", passwrd=" + passwrd
				+ ", loginAttempts=" + loginAttempts + ", status=" + status + ", customerId=" + customerId + "]";
	}
}
