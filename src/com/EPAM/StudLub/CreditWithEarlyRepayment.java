package com.EPAM.StudLub;

public class CreditWithEarlyRepayment extends Credit{
    @Override
   public void repayTheLoan(){
        System.out.println("В данном кредите есть возможность раннего погашения");
    }
}
