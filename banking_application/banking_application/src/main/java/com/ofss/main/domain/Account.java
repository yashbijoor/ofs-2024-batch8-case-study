package com.ofss.main.domain;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account_details")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
    private int accountId;
	
	@Column(name = "account_type")
    private String accountType;
	
	@CreationTimestamp
	@Column(name = "opening_date")
    private Timestamp openingDate;
	
	@Column(name = "min_balance")
    private double minBalance;
	
	@Column(name = "current_balance")
    private double currentBalance;
	
	@Column(name = "customer_id")
    private int customerId;
	
	@Column(name = "roi_id")
    private int roiId;
	
	@Column(name = "approval_status")
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

    public Account(int accountId, String accountType, Timestamp openingDate, double minBalance, double currentBalance,
			int customerId, int roiId, boolean approvalStatus) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
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
        return accountType;
    }

    public void setAccount_type(String account_type) {
        this.accountType = account_type;
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
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", openingDate=" + openingDate
				+ ", minBalance=" + minBalance + ", currentBalance=" + currentBalance + ", customerId=" + customerId
				+ ", roiId=" + roiId + ", approvalStatus=" + approvalStatus + "]";
	}

    
}
