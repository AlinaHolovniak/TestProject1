package lesson2;

import java.util.Scanner;

public class task2 {
    public static void main (String [] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите вес в фунтах") ;
        int num = in.nextInt();
        double result ;
        result = (num * 0.4536);
        int res1 = (int)result;
        double res2 = result - res1;
        res2 = res2 * 1000;
        System.out.println( res1 + " Килограмм(а)  " + res2 + " грамм(а)" );
    }
}
