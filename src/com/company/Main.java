package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        typeIsLeapYear(2022);
        typeVersion(1,2010);
        printDeliveryTime(76);
        checkDouble("aabccddefgghiijjkk");
        int[] arr = {3, 2, 1, 6, 5};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    //task1
    public static void typeIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    //task2
    public static void typeVersion(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для IOs по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите обычную версию приложения для iOs по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

    }

    //task3
    public static int printDeliveryTime(int deliveryDistance) {

        int deliveryTime = 1;
        if (deliveryDistance >= 1 && deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставка не возит");
        }
        return deliveryTime;
    }

    //task4
    public static void checkDouble(String abc ) {
        char[] letters = abc.toCharArray();
        char previousChar = Character.MAX_VALUE;

        for (char c : letters) {
            if (c == previousChar) {
                System.out.println(c);
                return;
            }
            previousChar = c;
        }
        System.out.println("Дубль не найден");
    }


    //task5
    public static void reverseArr(int [] array) {
        if(array.length<=1){
            return;
        }
        int start = 0;
        int end = array.length-1;
        while (start<end){
            int output = array[start];
            array[start++]=array[end];
            array[end--]=output;
        }
    }








}
