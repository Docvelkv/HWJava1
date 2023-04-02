package ru.gb.lesson1;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        // task 1
        System.out.println("---Task 1---");
        System.out.println(SimpleTasks.isSumBetween10And20(5, 15)); // true
        System.out.println(SimpleTasks.isSumBetween10And20(7, 15)); // false
        System.out.println(SimpleTasks.isSumBetween10And20(1, 8)); // false

        // task 2
        System.out.println("---Task 2---");
        System.out.println(SimpleTasks.isPositive(5)); // true
        System.out.println(SimpleTasks.isPositive(-3)); // false

        // task 3
        System.out.println("---Task 3---");
        SimpleTasks.printString("abcd", 5); // abcdabcdabcdabcdabcd

        // task 4
        System.out.println("---Task 4---");
        System.out.println(SimpleTasks.isLeapYear(1997));
        System.out.println(SimpleTasks.isLeapYear(2000));
        System.out.println(SimpleTasks.isLeapYear(1800));

        // task 5
        System.out.println("---Task 5---");
        System.out.println(Arrays.toString(SimpleTasks.createArray(10, 9)));

        // task 6
        System.out.println("---Task 6---");
        int[] array1 = SimpleTasks.createNumArray(10, 0, 1);
        System.out.println(Arrays.toString(array1));
        SimpleTasks.swappingElements(array1, 1, 0);

        // task 7
        System.out.println("---Task 7---");
        int[] array2 = SimpleTasks.createNumArray(12, 1, 11);
        System.out.println(Arrays.toString(array2));
        SimpleTasks.multiplicationElements(array2, 6, 2);

        // task 8
        System.out.println("---Task 8---");
        int[][] matrix1 = new int[10][10];
        SimpleTasks.changeDiagonals(matrix1);
    }
}