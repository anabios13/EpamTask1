package com.FakeDb;

import java.util.ArrayList;
import java.util.HashMap;

public class FakeDb {
    private ArrayList<ArrayList<?>> entities = new ArrayList<>();
    private ArrayList<Integer> requiredDeposits = new ArrayList<>();
    private ArrayList<Byte> interestRate = new ArrayList<>();
    private ArrayList<String> namesOfOffers = new ArrayList<>();
    private ArrayList<Boolean> earlyRepayments = new ArrayList<>();
    private ArrayList<Boolean> opportunityToExpandCredit = new ArrayList<>();
    private String[] arrayOfBankOffers = new String[]{"Credit+", "Major+", "Offer+", "Profit+", "Gold"};
    private String[] arrayOfBankNames = new String[]{"Петбанк", "Итробанк", "Тафбанк", "Ковбанк", "Таскбанк"};
    private HashMap<String, ArrayList<ArrayList<?>>> offersHashM = new HashMap<>();

    public String[] getArrayOfBankNames() {
        return arrayOfBankNames;
    }

    private void RandValueOfArrayList(String[] arrayOfBankOffersParameter) {
        namesOfOffers.clear();
        byte NumberOfComponents = (byte) ((int) (Math.random() * arrayOfBankOffersParameter.length) + 0);
        for (int i = 0; i < NumberOfComponents; i++)
            namesOfOffers.add(arrayOfBankOffersParameter[((int) (Math.random() * arrayOfBankOffersParameter.length) + 0)]);

    }

    public HashMap<String, ArrayList<ArrayList<?>>> getOffersHashM() {
        return offersHashM;
    }

    public void CreateFakeDb() {
            for (int i = 0; i < arrayOfBankNames.length; i++) {
                entities.clear();
                interestRate.clear();
                requiredDeposits.clear();
                earlyRepayments.clear();
                opportunityToExpandCredit.clear();
                RandValueOfArrayList(arrayOfBankOffers);
                    for (int k = 0; k < namesOfOffers.size(); k++) {//случайные числа процентной ставки, первоначального платежа..
                        interestRate.add((byte) ((int) (Math.random() * 10) + 10));
                        requiredDeposits.add(((int) (Math.random() * 30) + 100));
                        earlyRepayments.add((Math.random() < 0.5));
                        opportunityToExpandCredit.add((Math.random() < 0.5));
                    }
                    entities.add(namesOfOffers);
                    entities.add(requiredDeposits);
                    entities.add(interestRate);
                    entities.add(earlyRepayments);
                    entities.add(opportunityToExpandCredit);
                    offersHashM.put(arrayOfBankNames[i], entities);
                }
    }
}
