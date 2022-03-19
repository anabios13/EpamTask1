package com.EPAM.StudLub;

import com.FakeDb.FakeDb;

import java.util.Scanner;

public class ClassForCases {
    Menu menu = new Menu();
    VisualizerOfEntities visualizerOfEntities = new VisualizerOfEntities();

    public void methodForCase1(FakeDb fakeDb) {
        VisualizerOfEntities visualizerOfEntities = new VisualizerOfEntities();
        visualizerOfEntities.VisualizeOfListOffers(fakeDb.getOffersHashM(), fakeDb.getArrayOfBankNames());
    }

    public void methodForCase2(FakeDb fakeDb)  {
        int numerator = 1, checkerForCase2;
        Scanner scannerForCase2 = new Scanner(System.in);
        for (int i = 0; i < fakeDb.getArrayOfBankNames().length; i++)
            System.out.println((numerator++) + ". " + fakeDb.getArrayOfBankNames()[i]);
        System.out.println("Введите номер банка:");
        int numberOfBankName=0;
        while(numberOfBankName<=0 || numberOfBankName>fakeDb.getArrayOfBankNames().length) {
            checkerForCase2=0;
            try {
                numberOfBankName = scannerForCase2.nextInt();
            } catch (Exception e) {
                System.out.println("Пожалуйста введите корректный номер пункта в меню:");
                scannerForCase2.nextLine();
                checkerForCase2++;
            }
            if(checkerForCase2<1)
                System.out.println("Пожалуйста введите корректный номер пункта в меню:");
        }
             numberOfBankName = numberOfBankName-1;
        scannerForCase2.reset();
        if (fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(0).size() != 0) {
            visualizerOfEntities.VisualizeOfListOffers(fakeDb.getOffersHashM(), fakeDb.getArrayOfBankNames()[numberOfBankName]);
            System.out.println("Введите номер предложения:");
            int numberOfOffer =0;
            while(numberOfOffer<=0 || numberOfOffer>fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(3).size()) {
                checkerForCase2=0;
                try {
                    numberOfOffer = scannerForCase2.nextInt();
                } catch (Exception e) {
                    System.out.println("Пожалуйста введите корректный номер пункта в меню:");
                    scannerForCase2.nextLine();
                    checkerForCase2++;
                }
                if(checkerForCase2<1)
                System.out.println("Пожалуйста введите корректный номер пункта в меню:");
            }
            numberOfOffer = numberOfOffer - 1;
            scannerForCase2.reset();
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
                menu.printCaseForRequest();
                checkerForCase2 = 0;
                while (!scannerForCase2.hasNextByte()) {
                    checkerForCase2++;
                    if (checkerForCase2 > 1) {//проверка частоты выдачи запроса
                        System.out.println("Пожалуйста введите корректный номер пункта в меню:");
                        scannerForCase2.nextLine();
                    }
                }
                byte flagForRequest = scannerForCase2.nextByte();
                scannerForCase2.reset();
                switch (flagForRequest) {
                    case 1:
                        credit.leaveARequest();
                        break;
                }
            } else {
                CreditWithEarlyRepayment credit = new CreditWithEarlyRepayment();
                credit.setNameOfBank(fakeDb.getArrayOfBankNames()[numberOfBankName]);
                credit.setEarlyRepayment(bufferForEarlyRepaymentValue);
                credit.setInterestRate((byte) fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(2).get(numberOfOffer));
                credit.setNameOfOffer((String) fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(0).get(numberOfOffer));
                credit.setRequiredDeposit((Integer) fakeDb.getOffersHashM().get(fakeDb.getArrayOfBankNames()[numberOfBankName]).get(1).get(numberOfOffer));
                System.out.print("Название банка: " + credit.getNameOfBank() +
                        "\n" + "Название предложения: " + credit.getNameOfOffer() +
                        "\n" + "Первоначальный взнос: " + credit.getRequiredDeposit() +
                        "\n" + "Процентная ставка: " + credit.getInterestRate() + "\n");
                credit.repayTheLoan();
                menu.printCaseForRequest();
                checkerForCase2 = 0;
                while (!scannerForCase2.hasNextByte()) {
                    checkerForCase2++;
                    if (checkerForCase2 > 1) {//проверка частоты выдачи запроса
                        System.out.println("Пожалуйста введите корректный номер пункта в меню:");

                    }
                    scannerForCase2.nextLine();
                }
                byte flagForRequest = scannerForCase2.nextByte();
                scannerForCase2.reset();
                switch (flagForRequest) {
                    case 1:
                        credit.leaveARequest();
                        break;
                }
            }
        } else {
            System.out.println("У данного банка на данный момент отсутствуют предложения!");
        }
    }

    public void methodForCase3(FakeDb fakeDb) {
        int flagForCase3, checkerForCase3;
        Comparator comparator = new Comparator();
        menu.printCaseForCase3();
        Scanner scannerForCase3 = new Scanner(System.in);
        checkerForCase3 = 0;
        while (!scannerForCase3.hasNextInt()) {
            checkerForCase3++;
            if (checkerForCase3 > 1) {//проверка частоты выдачи запроса
                System.out.println("Пожалуйста введите корректный номер пункта в меню:");
                scannerForCase3.nextLine();
            }
        }
        flagForCase3 = scannerForCase3.nextInt();
        switch (flagForCase3) {
            case 1:
                comparator.compareByInterestRate(fakeDb.getOffersHashM(), fakeDb.getArrayOfBankNames());
                break;

            case 2:
                comparator.compareByRequiredDeposit(fakeDb.getOffersHashM(), fakeDb.getArrayOfBankNames());
                break;

            case 3:
                comparator.compareByEarlyRepayment(fakeDb.getOffersHashM(), fakeDb.getArrayOfBankNames());
                break;
        }
    }
}
