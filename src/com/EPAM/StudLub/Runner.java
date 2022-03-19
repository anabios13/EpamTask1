package com.EPAM.StudLub;

import com.FakeDb.FakeDb;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Menu menu = new Menu();
        FakeDb fakeDb = new FakeDb();
        ClassForCases classForCases = new ClassForCases();
        fakeDb.CreateFakeDb();
        Scanner scanner = new Scanner(System.in);

        menu.printCase1();
        int flag, checker;
        while (!scanner.hasNextInt()) {

            System.out.println("Пожалуйста введите корректный номер пункта в меню:");
            scanner.nextLine();
        }
        flag = scanner.nextInt();
        scanner.reset();
        while (flag != 4) {
            switch (flag) {
                case 1:
                    classForCases.methodForCase1(fakeDb);
                    break;

                case 2:
                    classForCases.methodForCase2(fakeDb);
                    break;

                case 3:
                    classForCases.methodForCase3(fakeDb);
                    break;
            }
            menu.printCase1();
            checker = 0;
            while (!scanner.hasNextInt()) {
                checker++;
                if (checker > 1) //проверка частоты выдачи запроса
                    System.out.println("Пожалуйста введите корректный номер пункта в меню:");
                scanner.nextLine();
            }
            flag = scanner.nextInt();
            scanner.reset();
        }
        scanner.close();
    }
}
