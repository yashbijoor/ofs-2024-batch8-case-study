package com.ofss.main.domain;

import java.math.BigInteger;

public class Customer {
    private int customerId;
    private String fName;
    private String lName;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String state;
    private int zip;
    private BigInteger phone;
    private String email;
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
