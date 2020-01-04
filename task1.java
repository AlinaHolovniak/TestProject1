package lesson2;

import java.util.Scanner;

public class task1 {
    public static void main (String [] arg) {
        Scanner in = new Scanner(System.in) ;
        System.out.println( "Please enter your number" );
        int number1 = in.nextInt() ;
        int digit1 = number1 % 10 ;
        int digit2 = number1 / 10 % 10 ;
        int digit3 = number1 / 100 % 10 ;
        int number2 = digit1 * 100 + digit2 * 10 + digit3 ;
        int result = number1 - number2 ;
        System.out.println(result);
    }
}
