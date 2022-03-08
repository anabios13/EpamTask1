package com.EPAM.StudLub;

import com.FakeDb.FakeDb;

import java.util.Scanner;

public class Runner {
public static  void main(String[] args){
Menu menu = new Menu();
FakeDb fakeDb = new FakeDb();
fakeDb.CreateFakeDb();
VisualizerOfEntities visualizerOfEntities = new VisualizerOfEntities();
    Scanner scanner = new Scanner(System.in);
    menu.printCase1();
int flag = scanner.nextInt();

while(flag!=4){
    switch (flag) {
        case 1:
            visualizerOfEntities.VisualizeOfListOffers(fakeDb.getOffersHashM(), fakeDb.getArrayOfBankNames());
            break;

        case 2:
            int numerator = 1;
            Scanner scannerForCase2 = new Scanner(System.in);
            for (int i = 0; i < fakeDb.getArrayOfBankNames().length; i++)
                System.out.println((numerator++) + ". " + fakeDb.getArrayOfBankNames()[i]);
            System.out.println("Введите номер банка:");

            int numberOfBankName = scannerForCase2.nextInt() - 1;
            if (fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(0).size() != 0) {
                visualizerOfEntities.VisualizeOfListOffers(fakeDb.getOffersHashM(), fakeDb.getArrayOfBankNames()[numberOfBankName]);
                System.out.println("Введите номер предложения:");
                int numberOfOffer = scannerForCase2.nextInt() - 1;
                boolean bufferForEarlyRepaymentValue = (boolean) fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(3).get(numberOfOffer);
                if (!bufferForEarlyRepaymentValue) {
                    Credit credit = new Credit();
                    credit.setNameOfBank(fakeDb.getArrayOfBankNames()[numberOfBankName]);
                    credit.setEarlyRepayment(bufferForEarlyRepaymentValue);
                    credit.setInterestRate((byte) fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(2).get(numberOfOffer));
                    credit.setNameOfOffer((String) fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(0).get(numberOfOffer));
                    credit.setRequiredDeposit((Integer) fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(1).get(numberOfOffer));
                    System.out.println("Название банка: " + credit.getNameOfBank() + "\n"
                            + "Название предложения: " + credit.getNameOfOffer() + "\n"
                            + "Первоначальный взнос: " + credit.getRequiredDeposit() + "\n"
                            + "Процентная ставка: " + credit.getInterestRate() + "\n");
                    credit.repayTheLoan();
                }
             else {
                CreditWithEarlyRepayment credit = new CreditWithEarlyRepayment();
                credit.setNameOfBank(fakeDb.getArrayOfBankNames()[numberOfBankName]);
                credit.setEarlyRepayment(bufferForEarlyRepaymentValue);
                credit.setInterestRate((byte) fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(2).get(numberOfOffer));
                credit.setNameOfOffer((String) fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(0).get(numberOfOffer));
                credit.setRequiredDeposit((byte) fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(1).get(numberOfOffer));
                System.out.print("Название банка: " + credit.getNameOfBank() +
                        "\n" + "Название предложения: " + credit.getNameOfOffer() +
                        "\n" + "Первоначальный взнос: " + credit.getRequiredDeposit() +
                        "\n" + "Процентная ставка: " + credit.getInterestRate() + "\n");
                credit.repayTheLoan();
            }
    }
            else {
         System.out.println(  "У данного банка на данный момент отсутствуют предложения!" );
         flag= 2;
            }

            break;

        case 3:
            break;
    }
    menu.printCase1();
    flag=scanner.nextInt();
}
scanner.close();
}
}
