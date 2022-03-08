package com.EPAM.StudLub;

import java.util.ArrayList;
import java.util.HashMap;

public class VisualizerOfEntities {
    public void VisualizeOfListOffers(HashMap<String, ArrayList<ArrayList<?>>> offersHashM, String[] arrayOfBankNames) {
        for (int i = 0; i < arrayOfBankNames.length; i++) {
            System.out.println(arrayOfBankNames[i]);
            for (int j = 0; j < offersHashM.get(arrayOfBankNames[i]).get(0).size(); j++) {
                for (int k = 0; k < offersHashM.get(arrayOfBankNames[i]).size(); k++) {
                    System.out.print(offersHashM.get(arrayOfBankNames[i]).get(k).get(j) + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
        public void VisualizeOfListOffers (HashMap < String, ArrayList < ArrayList < ?>>>offersHashM, String
        BankName){
        int numerator=1;
                System.out.println(BankName);
                for (int j = 0; j < offersHashM.get(BankName).get(0).size(); j++) {
                    System.out.print((numerator++)+". ");
                    for (int k = 0; k < offersHashM.get(BankName).size(); k++) {
                        System.out.print(offersHashM.get(BankName).get(k).get(j) + " ");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");
        }
    }