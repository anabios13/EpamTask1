package com.EPAM.StudLub;

import java.util.Scanner;

public class Runner {
public static  void main(String[] args){
Menu menu = new Menu();
FakeDb fakeDb = new FakeDb();
fakeDb.CreateFakeDb();
VisualizerOfLists visualizerOfLists = new VisualizerOfLists();
    Scanner scanner = new Scanner(System.in);
    menu.printCase1();
int flag = scanner.nextInt();
while(flag!=4){
    switch (flag){
        case 1:
            visualizerOfLists.VisualizeOfList(fakeDb.getEntities());

            break;
    }
    menu.printCase1();
    flag=scanner.nextInt();
}
scanner.close();
}
}
