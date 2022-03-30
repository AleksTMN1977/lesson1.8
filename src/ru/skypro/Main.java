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
        for (int i = 0; i < letters.length - 1; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                if (letters[i] == letters[j]) {
                    System.out.println("Найден дубликат: " + letters[j]);
                    return;
                }
            }
        }
        System.out.println("Дубликатов не найдено");
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

    public static void main(String[] args) {

        int year = 1968;
        checkYear(year);
        int yearOS = 2022;
        int clientOs = 0;
        int currentYear = LocalDate.now().getYear();
        versionOs(currentYear, clientOs, yearOS);
        int deliveryDistance = 2355;
        delivTime(deliveryDistance);
        String let = "aabccddefgghiijjkk";
        doubleLetter("aabccddefgghiijjkk");
        int arr[] = new int[]{3, 2, 1, 6, 5};
        System.out.println(Arrays.toString(arr));
        reversArr(arr);
        System.out.println(Arrays.toString(arr));

    }

}

