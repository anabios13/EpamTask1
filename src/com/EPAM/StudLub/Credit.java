package com.EPAM.StudLub;

public class Credit {
private String nameOfBank,nameOfOffer;
private int requiredDeposit;
private byte interestRate;

    public void setEarlyRepayment(boolean earlyRepayment) {
        this.earlyRepayment = earlyRepayment;
    }

    public boolean isEarlyRepayment() {
        return earlyRepayment;
    }

    private boolean   earlyRepayment;
    public byte getInterestRate() {
        return interestRate;
    }

    public int getRequiredDeposit() {
        return requiredDeposit;
    }

    public String getNameOfOffer() {
        return nameOfOffer;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setInterestRate(byte interestRate) {
        this.interestRate = interestRate;
    }

    public void setRequiredDeposit(int requiredDeposit) {
        this.requiredDeposit = requiredDeposit;
    }

    public void setNameOfOffer(String nameOfOffer) {
        this.nameOfOffer = nameOfOffer;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }


}

