package Cycle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        final int x =3;
        final int z =4;
        final int v = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Set length of array");
        int size = input.nextInt();
        int array []  = new int[size];
        System.out.println("Insert array elements");
        for (int i = 0; i< size; i++) {
            array [i] = input.nextInt();
        ;
       if (array [i] == x | array [i]==z | array [i] ==v) {
           System.out.println("This value already input in constant");
       }
        }




    }
}