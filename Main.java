package javaapplication23;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the first number");
        int x = sc.nextInt();

        System.out.println("Enter the Second number ");
        int y = sc.nextInt();

        int sum = x + y;

        System.out.println("The sum of "+ x +" and "+y+" is "+ sum );
    }

}
