package com.FakeDb;


import java.util.ArrayList;
import java.util.HashMap;

public class FakeDb {
    private ArrayList<ArrayList<?>> entities = new ArrayList<>();
    private ArrayList<ArrayList<?>> entities2 = new ArrayList<>();
    private ArrayList<ArrayList<?>> entities3 = new ArrayList<>();
    private ArrayList<ArrayList<?>> entities4 = new ArrayList<>();
    private ArrayList<ArrayList<?>> entities5 = new ArrayList<>();

    private ArrayList<Integer> requiredDeposits = new ArrayList<>();
    private ArrayList<Byte> interestRate = new ArrayList<>();
    private ArrayList<String> namesOfOffers = new ArrayList<>();
    private ArrayList<Boolean> earlyRepayments = new ArrayList<>();
    private ArrayList<Boolean> opportunityToExpandCredit = new ArrayList<>();

    private ArrayList<Integer> requiredDeposits2 = new ArrayList<>();
    private ArrayList<Byte> interestRate2 = new ArrayList<>();
    private ArrayList<String> namesOfOffers2 = new ArrayList<>();
    private ArrayList<Boolean> earlyRepayments2 = new ArrayList<>();
    private ArrayList<Boolean> opportunityToExpandCredit2 = new ArrayList<>();

    private ArrayList<Integer> requiredDeposits3 = new ArrayList<>();
    private ArrayList<Byte> interestRate3 = new ArrayList<>();
    private ArrayList<String> namesOfOffers3 = new ArrayList<>();
    private ArrayList<Boolean> earlyRepayments3 = new ArrayList<>();
    private ArrayList<Boolean> opportunityToExpandCredit3 = new ArrayList<>();

    private ArrayList<Integer> requiredDeposits4 = new ArrayList<>();
    private ArrayList<Byte> interestRate4 = new ArrayList<>();
    private ArrayList<String> namesOfOffers4 = new ArrayList<>();
    private ArrayList<Boolean> earlyRepayments4 = new ArrayList<>();
    private ArrayList<Boolean> opportunityToExpandCredit4 = new ArrayList<>();

    private ArrayList<Integer> requiredDeposits5 = new ArrayList<>();
    private ArrayList<Byte> interestRate5 = new ArrayList<>();
    private ArrayList<String> namesOfOffers5 = new ArrayList<>();
    private ArrayList<Boolean> earlyRepayments5 = new ArrayList<>();
    private ArrayList<Boolean> opportunityToExpandCredit5 = new ArrayList<>();

    private String[] arrayOfBankOffers = new String[]{"Credit+", "Major+", "Offer+", "Profit+", "Gold"};
    private String[] arrayOfBankNames = new String[]{"Петбанк", "Итробанк", "Тафбанк", "Ковбанк", "Таскбанк"};
    private HashMap<String, ArrayList<ArrayList<?>>> offersHashM = new HashMap<>();
    private ArrayList<ArrayList<ArrayList<?>>> bufferForEntities = new ArrayList<>();
    public String[] getArrayOfBankNames() {
        return arrayOfBankNames;
    }

    private ArrayList RandValueOfArrayList(String[] arrayOfBankOffersParameter,ArrayList<String>buffer) {
        buffer.clear();
        byte NumberOfComponents = (byte) ((int) (Math.random() * arrayOfBankOffersParameter.length) + 0);
        for (int i = 0; i < NumberOfComponents; i++)
            buffer.add(arrayOfBankOffersParameter[((int) (Math.random() * arrayOfBankOffersParameter.length) + 0)]);
        return buffer;
    }

    public HashMap<String, ArrayList<ArrayList<?>>> getOffersHashM() {
        return offersHashM;
    }

    public void CreateFakeDb() {

        opportunityToExpandCredit.clear();
        namesOfOffers = RandValueOfArrayList(arrayOfBankOffers,namesOfOffers);
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
        offersHashM.putIfAbsent(arrayOfBankNames[0],  entities);


        namesOfOffers2=RandValueOfArrayList(arrayOfBankOffers,namesOfOffers2);
        for (int k = 0; k < namesOfOffers2.size(); k++) {//случайные числа процентной ставки, первоначального платежа..
            interestRate2.add((byte) ((int) (Math.random() * 10) + 10));
            requiredDeposits2.add(((int) (Math.random() * 30) + 100));
            earlyRepayments2.add((Math.random() < 0.5));
            opportunityToExpandCredit2.add((Math.random() < 0.5));
        }
        entities2.add(namesOfOffers2);
        entities2.add(requiredDeposits2);
        entities2.add(interestRate2);
        entities2.add(earlyRepayments2);
        entities2.add(opportunityToExpandCredit2);
        offersHashM.putIfAbsent(arrayOfBankNames[1],  entities2);


        namesOfOffers3= RandValueOfArrayList(arrayOfBankOffers, namesOfOffers3);
        for (int k = 0; k < namesOfOffers3.size(); k++) {//случайные числа процентной ставки, первоначального платежа..
            interestRate3.add((byte) ((int) (Math.random() * 10) + 10));
            requiredDeposits3.add(((int) (Math.random() * 30) + 100));
            earlyRepayments3.add((Math.random() < 0.5));
            opportunityToExpandCredit3.add((Math.random() < 0.5));
        }
        entities3.add(namesOfOffers3);
        entities3.add(requiredDeposits3);
        entities3.add(interestRate3);
        entities3.add(earlyRepayments3);
        entities3.add(opportunityToExpandCredit3);
        offersHashM.putIfAbsent(arrayOfBankNames[2],  entities3);



        namesOfOffers4=  RandValueOfArrayList(arrayOfBankOffers, namesOfOffers4);
        for (int k = 0; k < namesOfOffers4.size(); k++) {//случайные числа процентной ставки, первоначального платежа..
            interestRate4.add((byte) ((int) (Math.random() * 10) + 10));
            requiredDeposits4.add(((int) (Math.random() * 30) + 100));
            earlyRepayments4.add((Math.random() < 0.5));
            opportunityToExpandCredit4.add((Math.random() < 0.5));
        }
        entities4.add(namesOfOffers4);
        entities4.add(requiredDeposits4);
        entities4.add(interestRate4);
        entities4.add(earlyRepayments4);
        entities4.add(opportunityToExpandCredit4);
        offersHashM.putIfAbsent(arrayOfBankNames[3],  entities4);

        namesOfOffers5=  RandValueOfArrayList(arrayOfBankOffers,namesOfOffers5);
        for (int k = 0; k < namesOfOffers5.size(); k++) {//случайные числа процентной ставки, первоначального платежа..
            interestRate5.add((byte) ((int) (Math.random() * 10) + 10));
            requiredDeposits5.add(((int) (Math.random() * 30) + 100));
            earlyRepayments5.add((Math.random() < 0.5));
            opportunityToExpandCredit5.add((Math.random() < 0.5));
        }
        entities5.add(namesOfOffers5);
        entities5.add(requiredDeposits5);
        entities5.add(interestRate5);
        entities5.add(earlyRepayments5);
        entities5.add(opportunityToExpandCredit5);
        offersHashM.putIfAbsent(arrayOfBankNames[4],  entities5);
   }

}
