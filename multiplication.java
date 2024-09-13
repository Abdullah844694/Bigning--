/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication23;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class multiplication {


     public static void main(String[] args){

         Scanner sc = new Scanner(System.in) ;

         System.out.println("Enter the a number");
        int a = sc.nextInt();

        for(int i = 1;i<=10;i++){
            int result = a *i;
            System.out.println(a+" x "+i+ " = " +result);
        }
        
}
}
