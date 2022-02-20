package com.EPAM.StudLub;

import java.util.ArrayList;

public class FakeDb {
   private ArrayList<ArrayList<?>> entities = new ArrayList<>();
   private ArrayList<Integer> requiredDeposits = new ArrayList<>();
   private ArrayList<Byte> interestRate = new ArrayList<>();
   private ArrayList<String> namesOfOffers = new ArrayList<>();
   private ArrayList<String> namesOfBanks  = new ArrayList<>();
   private ArrayList<Boolean> earlyRepayments= new ArrayList<>();



    public ArrayList<ArrayList<?>> getEntities() {
        return entities;
    }

    public  void CreateFakeDb() {
    String[] arrayOfBankOffers=new String[]{"Credit+","Major+","Offer+","Profit+","Gold"};
String[] arrayOfBankNames=new String[]{"Петбанк","Итробанк","Тафбанк","Ковбанк","Таскбанк"};
    for (int i = 0; i <5; i++) {//случайные числа процентной ставки и первоначального платежа
        interestRate.add((byte) ((int) (Math.random() * 10) + 10));
        requiredDeposits.add(((int) (Math.random() * 30) + 100));
earlyRepayments.add((Math.random()<0.5));
    }
    entities.add(namesOfOffers);
    entities.add(namesOfBanks);
    entities.add(requiredDeposits);
    entities.add(interestRate);
entities.add(earlyRepayments);
}
}
