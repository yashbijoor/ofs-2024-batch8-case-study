package com.ofss.main.domain;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_details")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
    private int customerId;
	
	@Column(name = "f_name")
    private String fName;
	
	@Column(name = "l_name")
    private String lName;
	
	@Column(name = "address_line_1")
    private String addressLine1;
	
	@Column(name = "address_line_2")
    private String addressLine2;
	
	@Column(name = "address_line_3")
    private String addressLine3;
	
	@Column(name = "city")
    private String city;
	
	@Column(name = "state")
    private String state;
	
	@Column(name = "zip")
    private int zip;
	
	@Column(name = "phone")
    private BigInteger phone;
	
	@Column(name = "email")
    private String email;
	
	@Column(name = "status")
    private String status;
    public Customer() {
        System.out.println("Default constructor for Customer");
    }
    public Customer(int customerId, String fName, String lName, String addressLine1, String addressLine2,
            String addressLine3, String city, String state, int zip, BigInteger phone, String email, String status) {
        this.customerId = customerId;
        this.fName = fName;
        this.lName = lName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.status = status;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getAddressLine3() {
        return addressLine3;
    }
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public BigInteger getPhone() {
        return phone;
    }
    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", firstName=" + fName + ", lastName=" + lName
        + ", address: " + addressLine1 + " " + addressLine2 + " " + addressLine3 + ", city: " + city+ ", state: " + state + ", zip: " + zip + ", email=" + email + ", mobile=" + phone
        + ", customerStatus=" + status + "]";
    }
}
