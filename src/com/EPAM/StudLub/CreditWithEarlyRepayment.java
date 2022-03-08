package com.EPAM.StudLub;

public class CreditWithEarlyRepayment extends Credit{
    @Override
    void repayTheLoan(){
        System.out.println("В данном кредите есть возможность раннего погашения");
    }
}
