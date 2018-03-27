package com.example.creation.builder;

/**
 * Created by chuliu on 2018/3/27.
 */
public class Loan {

    private long loanAccount;
    private String loanName;
    private double loanAmount;
    private boolean approved;
    private double loanFee;
    private double roi;

    public Loan() {
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public long getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(long loanAccount) {
        this.loanAccount = loanAccount;
    }

    public double getLoanFee() {
        return loanFee;
    }

    public void setLoanFee(double loanFee) {
        this.loanFee = loanFee;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanAccount=" + loanAccount +
                ", loanName='" + loanName + '\'' +
                ", loanAmount=" + loanAmount +
                ", approved=" + approved +
                ", loanFee=" + loanFee +
                ", roi=" + roi +
                '}';
    }
}
