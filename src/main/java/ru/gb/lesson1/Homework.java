package ru.gb.lesson1;

import  java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        // task 1
        System.out.println("---Task 1---");
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(1, 8)); // false

        // task 2
        System.out.println("---Task 2---");
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        // task 3
        System.out.println("---Task 3---");
        printString("abcd", 5); // abcdabcdabcdabcdabcd

        // task 4
        System.out.println("---Task 4---");
        System.out.println(isLeapYear(1997));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1800));

        // task 5
        System.out.println("---Task 5---");
        System.out.println(Arrays.toString(createArray(10, 9)));
    }

    // ---Task 1---
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int res = a + b;
        if (res >= 10 && res <= 20) {
            return true;
        }
        return false;
    }

    // ---Task 2---
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if(x > 0) {
            return  true;
        }
        return false;
    }

    // ---Task 3---
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }

    // ---Task 4---
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    // ---Task 5---
    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     *
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     *
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     */

}