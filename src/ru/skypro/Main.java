package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

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

    public static void delivTime(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки карты составит 1 день");
        } else {
            System.out.println("Срок доставки карты составит " + (deliveryDistance / 40 + 1) + " дн.");
        }
    }

    public static void doubleLetter(String let) {

        char[] letters = let.toCharArray();
        char prevChar = Character.MAX_VALUE;
        StringBuilder result = new StringBuilder();
        for (char c : letters) {
            if (c == prevChar) {
                System.out.println("Дубликат найден: " + result);
                return;
            }
            result.append(c);
            prevChar = (char) c;
        }
        System.out.println("Дубликатов не найдено");
    }

    public static void main(String[] args) {

        int year = 2022;
        checkYear(year);
        int yearOS = 2021;
        int clientOs = 0;
        int currentYear = LocalDate.now().getYear();
        versionOs(currentYear, clientOs, yearOS);
        int deliveryDistance = 195;
        delivTime(deliveryDistance);
        String let = "aabccddefgghiijjkk";
        doubleLetter("aabccddefgghiijjkk");
        int arr[] = new int[]{3, 2, 1, 6, 5};
        System.out.println(Arrays.toString(arr));
        reversArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reversArr(int arr[]) {

        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            int tmp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = tmp;
        }
    }
}

