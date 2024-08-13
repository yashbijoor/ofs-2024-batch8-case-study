package com.ofss.main.domain;

public class BankSlip {
    private int slipId;
    private int accountId;
    private int chequeNo;
    private int amount;
    private String status;
    
    public BankSlip() {
        System.out.println("Deafult constructor for BankSlip");
    }

    public BankSlip(int slipId, int accountId, int chequeNo, int amount, String status) {
        this.slipId = slipId;
        this.accountId = accountId;
        this.chequeNo = chequeNo;
        this.amount = amount;
        this.status = status;
    }

    public int getSlipId() {
        return slipId;
    }

    public void setSlipId(int slipId) {
        this.slipId = slipId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(int chequeNo) {
        this.chequeNo = chequeNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
