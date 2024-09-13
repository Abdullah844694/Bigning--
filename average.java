package javaapplication23;

import java.util.Scanner;
public class average {

     public static void main(String[] args){

         Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the first number");
        double x = sc.nextDouble();

        System.out.println("Enter the Second number");
        double y = sc.nextDouble();

        System.out.println("Enter the Third number");
        double z = sc.nextDouble();

        double avg = (x+y+z)/3.0;

        System.out.println("The Average is: " +avg );
}
}
