package com.EPAM.StudLub;

import java.util.ArrayList;
import java.util.HashMap;

public class VisualizerOfEntities {
    public void VisualizeOfEntity(HashMap <String,ArrayList<ArrayList<?>>> offersHashM,String[] arrayOfBankNames){
        for(int i=0; i<arrayOfBankNames.length;i++) {
            System.out.println(arrayOfBankNames[i]);
        for (int j=0;j < offersHashM.get(arrayOfBankNames[i]).get(0).size();j++){
                for(int k =0;k<offersHashM.get(arrayOfBankNames[i]).size();k++) {
                    System.out.print(offersHashM.get(arrayOfBankNames[i]).get(k).get(j)+" ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }

    }
}