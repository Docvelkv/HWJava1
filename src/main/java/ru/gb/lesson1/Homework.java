package ru.gb.lesson1;

import java.util.Arrays;
import java.util.Random;

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

        // task 6
        System.out.println("---Task 6---");
        int[] array1 = createNumArray(10, 0, 1);
        System.out.println(Arrays.toString(array1));
        swappingElements(array1, 1, 0);

        // task 7
        System.out.println("---Task 7---");
        int[] array2 = createNumArray(12, 1, 11);
        System.out.println(Arrays.toString(array2));
        multiplicationElements(array2, 6, 2);

        // task 8
        System.out.println("---Task 8---");
        int[][] matrix1 = new int[10][10];
        changeDiagonals(matrix1);        
    }

    /**
     * ---Task 1---
     * Проверить, что сумма a и b лежит между 10 и 20.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int res = a + b;
        if (res >= 10 && res <= 20) {
            return true;
        }
        return false;
    }

    /**
     * ---Task 2---
     * Проверить, что х положительное.
     */
    private static boolean isPositive(int x) {
        if(x > 0) {
            return  true;
        }
        return false;
    }

    /**
     * ---Task 3---
     * Напечатать строку source repeat раз.
     */
    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }

    /**
     * ---Task 4---
     * Проверить, является ли год високосным. если да - return true.
     * Год является високосным, если он делится на 4, но не делится на 100, но делится на 400.
     */
    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    /**
     *  ---Task 5---
     * Нужно вернуть массив длины len, каждое значение которого равно initialValue.
     */ 
    private static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    /**
     * ---Task 6---
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0.
     */
    public static int[] createNumArray(int num, int start, int end) {
        Random rnd = new Random();
        int[] array = new int[num];
        if(start == 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(end + 1);
            }
        }
        else {
            end = end - start;
            for (int i = 0; i < array.length; i++) {
                array[i] =  rnd.nextInt(end + 1) + start;
            }
        }
        return array;
    }

    public static void swappingElements(int[] array, int elm1, int elm2) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elm1) {
                array[i] = elm2;
            }
            else if (array[i] == elm2) {
                array[i] = elm1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

     /* 
     * ---Task 7---
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ].
     * Пройти по нему циклом, и числа меньшие 6 умножить на 2.
     */
    public static void multiplicationElements(int[] array, int lessThen, int multiplyBy) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lessThen) {
                array[i] *= multiplyBy; 
            }
        }
        System.out.println(Arrays.toString(array));
    }

     /**
     * ---Task 8---
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
     */
    public static void changeDiagonals(int[][] inputMatrix) {
        int mLen = inputMatrix.length;
        for (int i = 0; i < mLen; i++) {
            for (int j = 0; j < mLen; j++) {
                if (j == i || j == mLen - i - 1)
                    inputMatrix[i][j] = 1;
            }
        }
        for (int i = 0; i < mLen; i++) {
            System.out.println(Arrays.toString(inputMatrix[i]));
        }
    }
}