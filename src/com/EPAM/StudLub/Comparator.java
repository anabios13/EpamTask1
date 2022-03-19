package com.EPAM.StudLub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Comparator {
    private Credit credit = new Credit();

    public void compareByInterestRate(HashMap<String, ArrayList<ArrayList<?>>> offersHashM, String[] arrayOfBankNames) {
        for (int i = 0; i < arrayOfBankNames.length; i++) {//поиск минимлаьного значения процентной ставки
            if (!offersHashM.get(arrayOfBankNames[i]).get(2).isEmpty()) {
                byte bufferForElement = Collections.min((ArrayList<Byte>) offersHashM.get(arrayOfBankNames[i]).get(2));
                for (int j = 0; j < offersHashM.get(arrayOfBankNames[i]).get(2).size(); j++) {
                    if ((Byte) offersHashM.get(arrayOfBankNames[i]).get(2).get(j) == bufferForElement) {
                        credit.setNameOfBank(arrayOfBankNames[i]);
                        credit.setInterestRate(bufferForElement);
                        credit.setRequiredDeposit((Integer) offersHashM.get(arrayOfBankNames[i]).get(1).get(j));
                        credit.setEarlyRepayment((Boolean) offersHashM.get(arrayOfBankNames[i]).get(3).get(j));
                        credit.setNameOfOffer((String) offersHashM.get(arrayOfBankNames[i]).get(0).get(j));
                        System.out.print("Название банка: " + credit.getNameOfBank() +
                                "\n" + "Название предложения: " + credit.getNameOfOffer() +
                                "\n" + "Первоначальный взнос: " + credit.getRequiredDeposit() +
                                "\n" + "Процентная ставка: " + credit.getInterestRate() + "\n");
                        credit.isEarlyRepayment();
                        System.out.println("");
                    }
                }
            }
        }
    }

    public void compareByRequiredDeposit(HashMap<String, ArrayList<ArrayList<?>>> offersHashM, String[] arrayOfBankNames) {
        for (int i = 0; i < arrayOfBankNames.length; i++) {//поиск минимлаьного значения процентной ставки
            if (!offersHashM.get(arrayOfBankNames[i]).get(1).isEmpty()) {
                int bufferForElement = Collections.min((ArrayList<Integer>) offersHashM.get(arrayOfBankNames[i]).get(1));
                for (int j = 0; j < offersHashM.get(arrayOfBankNames[i]).get(1).size(); j++) {
                    if ((Integer) offersHashM.get(arrayOfBankNames[i]).get(1).get(j) == bufferForElement) {
                        credit.setNameOfBank(arrayOfBankNames[i]);
                        credit.setInterestRate((Byte) offersHashM.get(arrayOfBankNames[i]).get(2).get(j));
                        credit.setRequiredDeposit(bufferForElement);
                        credit.setEarlyRepayment((Boolean) offersHashM.get(arrayOfBankNames[i]).get(3).get(j));
                        credit.setNameOfOffer((String) offersHashM.get(arrayOfBankNames[i]).get(0).get(j));
                        System.out.print("Название банка: " + credit.getNameOfBank() +
                                "\n" + "Название предложения: " + credit.getNameOfOffer() +
                                "\n" + "Первоначальный взнос: " + credit.getRequiredDeposit() +
                                "\n" + "Процентная ставка: " + credit.getInterestRate() + "\n");
                        credit.isEarlyRepayment();
                        System.out.println("");
                    }
                }
            }
        }
    }

    public void compareByEarlyRepayment(HashMap<String, ArrayList<ArrayList<?>>> offersHashM, String[] arrayOfBankNames) {
        for (int i = 0; i < arrayOfBankNames.length; i++) {//поиск минимлаьного значения процентной ставки
            if (!offersHashM.get(arrayOfBankNames[i]).get(3).isEmpty()) {
                for (int j = 0; j < offersHashM.get(arrayOfBankNames[i]).get(3).size(); j++) {
                    if ((Boolean) offersHashM.get(arrayOfBankNames[i]).get(3).get(j).equals(true)) {
                        credit.setNameOfBank(arrayOfBankNames[i]);
                        credit.setInterestRate((Byte) offersHashM.get(arrayOfBankNames[i]).get(2).get(j));
                        credit.setRequiredDeposit((Integer) offersHashM.get(arrayOfBankNames[i]).get(1).get(j));
                        credit.setEarlyRepayment((Boolean) offersHashM.get(arrayOfBankNames[i]).get(3).get(j));
                        credit.setNameOfOffer((String) offersHashM.get(arrayOfBankNames[i]).get(0).get(j));
                        System.out.print("Название банка: " + credit.getNameOfBank() +
                                "\n" + "Название предложения: " + credit.getNameOfOffer() +
                                "\n" + "Первоначальный взнос: " + credit.getRequiredDeposit() +
                                "\n" + "Процентная ставка: " + credit.getInterestRate() + "\n");
                        credit.isEarlyRepayment();
                        System.out.println("");
                    }
                }
            }
        }
    }
}
