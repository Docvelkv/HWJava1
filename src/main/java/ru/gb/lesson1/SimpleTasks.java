package ru.gb.lesson1;

import java.util.Arrays;
import java.util.Random;

public  class SimpleTasks {
    /**
     * Метод проверяет, что сумма двух входящих значений
     * находится в диапазоне от 10 до 20 включительно.
     * @param a первое входящее значение
     * @param b второе входящее значение
     * @return boolean да или нет
     */
    public static boolean isSumBetween10And20(int a, int b) {
        int res = a + b;
        return res >= 10 && res <= 20;
    }

    /**
     * Проверка, что число положительное
     * @param x входящее число
     * @return boolean да или нет
     */
    public static boolean isPositive(int x) {
        return x > 0;
    }

    /**
     * Напечатать входящую строку n раз
     * @param source входящая строка
     * @param repeat количество повторений печати
     */
    public static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }

    /**
     * Проверить, является ли год високосным. если да - return true.
     * Год является високосным, если он делится на 4, но не делится на 100, но делится на 400.
     * @param year указанный год
     * @return boolean да или нет
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    /**
     * Нужно вернуть массив длины len, каждое значение которого равно initialValue.
      * @param len длина массива
     * @param initialValue значение
     * @return массив целых чисел
     */
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0.
     * @param num число элементов массива
     * @param start минимальное значение
     * @param end максимальное значение
     * @return массив целых чисел
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

    /**
     * Обмен значений между двумя элементами массива
     * @param array входящий массив
     * @param elm1 первый элемент
     * @param elm2 второй элемент
     */
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

    /**
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ].
     * Пройти по нему циклом, и числа меньшие 6 умножить на 2.
     * @param array входящий массив
     * @param lessThen граница значений
     * @param multiplyBy во сколько раз увеличить значение
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
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
     * @param inputMatrix входящий двумерный массив
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