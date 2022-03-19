package com.EPAM.StudLub;

public class Menu {
    public void printCase1() {
        System.out.println("1.Просмотр предложений по кредитам");
        System.out.println("2.Выбор предложения по кредиту");
        System.out.println("3.Поиск кредита");
        System.out.println("4.Закончить");
        System.out.println("Ввод: ");
    }

    public void printCaseForRequest() {
        System.out.println("Оставить заявку на оформление?");
        System.out.println("1.Да");
        System.out.println("2.Нет");
        System.out.println("Ввод: ");
    }

    public void printCaseForCase3() {
        System.out.println("1. Найти предложение с наименьшей кредитной ставкой по банку");
        System.out.println("2. Найти предложение с наименьшим первоначальным взносом по банку");
        System.out.println("3. Найти предложения с возможностью досрочного погашения");
        System.out.println("Ввод: ");
    }
}
