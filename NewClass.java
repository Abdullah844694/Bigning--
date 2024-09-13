
package javaapplication23;

import java.util.Scanner;
public class NewClass {


    public static void main(String[] args){

         Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the first number");
        double x = sc.nextDouble();



        System.out.println("Enter the Second number");
        double y = sc.nextDouble();


        double pro = x*y;

        System.out.println("Product " + pro);
    }
}
