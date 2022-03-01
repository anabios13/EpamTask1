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
    switch (flag){
        case 1:
            visualizerOfEntities.VisualizeOfEntity(fakeDb.getOffersHashM(),fakeDb.getArrayOfBankNames());
            break;

        case 2:

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
