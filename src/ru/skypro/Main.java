package ru.skypro;

import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является невисокосным");
        }
    }

    public static void versionOs(int currentYear, int clientOS, int yearOs) {
        if (clientOS == 0 && currentYear <= yearOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && currentYear > yearOs) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS != 0 && currentYear <= yearOs) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void main(String[] args) {
        int year = 2022;
        checkYear(year);
        int yearOS = 2022;
        int clientOs = 0;
        int currentYear = LocalDate.now().getYear();
        versionOs(currentYear, clientOs,yearOS);
    }
}
