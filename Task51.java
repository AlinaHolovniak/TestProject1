package com.epam.task5;

public class Task51 {
    public static void main(String[] args) {
        int size = 10;
        int [] array1 = new int [size];
        int [] array2 = new int [size];
        int [] sumOfArrays = new int [size];
        System.out.println("The first array is: ");

        for (int i = 0; i < size; i++) {
            array1[i] = ((int) (Math.random() * 20));
            System.out.print(array1[i] + " ");
        }

        System.out.println('\n' + "The second array is: ");

        for (int i = 0; i < size; i++) {
            array2[i] = ((int) (Math.random() * 20));
            System.out.print(array2[i] + " ");
        }
       System.out.println('\n' + "The sum of arrays is:");

       for (int i = 0; i < size; i++) {
           sumOfArrays[i] = array1[i] + array2[i];
           System.out.print (sumOfArrays[i] + " ");
       }

    }
}


