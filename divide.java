package javaapplication23;

import java.util.Scanner;

public class divide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the a number");
        double a = sc.nextDouble();
        
        while (a > 1000) {
            
            a = a / 2;
            System.out.println(a);
            
            
        }
        
    }
}
