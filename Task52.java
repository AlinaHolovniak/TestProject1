package com.epam.task5;

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        System.out.println("Please enter length of an array (positive number)");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println('\n' + "Your generated array: ");

        for (int i = 0; i < size; i++) {
            array[i] = ((int) ((Math.random() * 40) - 20));
            System.out.print(array[i] + " ");
        }
        System.out.println('\n' + "Negative values: ");
        for (int value : array) {
            if (value < 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println('\n' +"Positive values: ");
        for (int value : array) {
            if (value > 0) {
                System.out.print(value + " ");
            }
        }
    }
}

