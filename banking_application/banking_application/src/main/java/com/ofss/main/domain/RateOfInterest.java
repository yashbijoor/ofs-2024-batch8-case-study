package com.ofss.main.domain;

public class RateOfInterest {
    private int roiId;
    private String accountType;
    private double interestRate;
    private double years;

    public RateOfInterest() {
        System.out.println("Default constructor for RateOfInterest");
    }

    public RateOfInterest(int roiId, String accountType, double interestRate, double years) {
        this.roiId = roiId;
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.years = years;
    }

    public int getRoiId() {
        return roiId;
    }

    public void setRoiId(int roiId) {
        this.roiId = roiId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    
}
