package com.ofss.main.domain;

public class Cheque {
    private int chequeNo;
    private int accountId;
    private int slipId;
    private String status;
    public Cheque() {
        System.out.println("Default constructor for Cheque");
    }
    public Cheque(int chequeNo, int accountId, int slipId, String status) {
        this.chequeNo = chequeNo;
        this.accountId = accountId;
        this.slipId = slipId;
        this.status = status;
    }
    public int getChequeNo() {
        return chequeNo;
    }
    public void setChequeNo(int chequeNo) {
        this.chequeNo = chequeNo;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public int getSlipId() {
        return slipId;
    }
    public void setSlipId(int slipId) {
        this.slipId = slipId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    
}
