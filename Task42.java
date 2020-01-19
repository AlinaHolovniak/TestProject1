package com.epam.task;

import java.util.Scanner;

public class Task42 {
    public static String getBinary(int num) {
        String str = "";
        while (num > 0) {
            str = ((num % 2) == 0 ? "0" : "1") + str ;
            num = num / 2;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int str2 = sc.nextInt();
        System.out.println(getBinary(str2));
    }
}

