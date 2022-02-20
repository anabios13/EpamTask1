package com.EPAM.StudLub;

import java.util.ArrayList;

public class VisualizerOfLists {
    public void VisualizeOfList(ArrayList<ArrayList<?>> entities){
        for(int i=0 ;i<entities.size();i++) {
            for(int j=0 ;j<entities.size();j++) {
                System.out.println(entities.get(1).get(1));
            }
        }
    }
}
