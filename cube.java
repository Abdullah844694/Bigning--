package javaapplication23;

import java.util.Scanner;
public class cube {

     public static void main(String[] args){

         Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the  number");
        int x = sc.nextInt();

        int cube = (x*x*x);

        System.out.println("The cube of " + x+ " is " +cube);
}
}
