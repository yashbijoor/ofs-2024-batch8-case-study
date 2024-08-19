package com.ofss.main.domain;

public class Transaction {
    private int transactionId;
    private int accountTo;
    private int accountFrom;
    private double transactionAmount;
    private String transactionType;
    
    public Transaction() {
        System.out.println("Default constructor for Transaction");
    }

    public Transaction(int transactionId, int accountTo, int accountFrom, double transactionAmount,
            String transactionType) {
        this.transactionId = transactionId;
        this.accountTo = accountTo;
        this.accountFrom = accountFrom;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(int accountTo) {
        this.accountTo = accountTo;
    }

    public int getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(int accountFrom) {
        this.accountFrom = accountFrom;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    
}
