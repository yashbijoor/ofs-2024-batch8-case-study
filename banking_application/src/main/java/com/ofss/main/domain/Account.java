package com.ofss.main.domain;

import java.sql.Timestamp;

public class Account {
    private int accountId;
    private String account_type;
    private Timestamp openingDate;
    private double minBalance;
    private double currentBalance;
    private int customerId;
    private int roiId;
    private boolean approvalStatus;

    public boolean isApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(boolean approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Timestamp getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Timestamp openingDate) {
        this.openingDate = openingDate;
    }

    public Account() {
        System.out.println("Default constructor for Account");
    }

    public Account(int accountId, String account_type, Timestamp openingDate, double minBalance, double currentBalance, int customerId,
            int roiId, boolean approvalStatus) {
        this.accountId = accountId;
        this.account_type = account_type;
        this.openingDate = openingDate;
        this.minBalance = minBalance;
        this.currentBalance = currentBalance;
        this.customerId = customerId;
        this.roiId = roiId;
        this.approvalStatus = approvalStatus;
    }

    public boolean withdraw(double amount) {
        if (amount <= currentBalance && amount > 0) {
            currentBalance = currentBalance - amount;
            return true;
        } else {
            System.out.println("Not enough balance in account.");
            return false;
        }
    }


    public boolean deposit(double amount) {
        if (amount > 0) {
            currentBalance = currentBalance + amount;
            return true;
        }
        return false;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRoiId() {
        return roiId;
    }

    public void setRoiId(int roiId) {
        this.roiId = roiId;
    }

    @Override
    public String toString() {
        return "Account [ accountID :: " + accountId + ", Account Tyoe :: " + account_type + ", Opening Date :: " + openingDate + ", Minimum Balance :: " + minBalance + ", Current Balance :: " + currentBalance + ", Customer ID :: " + customerId + ", ROI ID :: " + roiId + ", Approval Status :: " + approvalStatus + " ]";
    }
}
