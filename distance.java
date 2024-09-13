package javaapplication23;

import java.util.Scanner;
public class distance {

    
     public static void main(String[] args){

         Scanner sc = new Scanner(System.in) ;

         System.out.println("Enter the x1 number");
        int x1 = sc.nextInt();

        System.out.println("Enter the x2 number");
        int x2 = sc.nextInt();

        System.out.println("Enter the y1 number");
        int y1 = sc.nextInt();

        System.out.println("Enter the y2 number");
        int y2 = sc.nextInt();

        double dis = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1 - y2, 2));

        System.out.println("Distance: "+ dis);
}
}
