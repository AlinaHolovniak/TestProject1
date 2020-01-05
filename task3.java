package lesson2;

import java.util.Scanner;

public class task3 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите сумму депозита: ");
        int sum = in.nextInt();
        Scanner in1 = new Scanner(System.in);
        System.out.println(" Введите годовую процентную ставку: ");
        int p = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println(" Введите срок вложения в месяцах : ");
        int month = in.nextInt();
        Scanner in3 = new Scanner(System.in);
        int result ;
        result = ( sum * p * month ) / ( 12 * 100);
        System.out.println( "Полученый доход = " +  result + " UAH ");
    }

}
