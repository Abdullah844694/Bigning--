
package javaapplication23;

import java.util.Scanner;
public class fraction {

    
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
     double num = sc.nextDouble();
     
     double sum = 0;
     
     for(int i = 1;i <= num;i++){
         
         sum = sum + 1.0/i;
     }
        System.out.println("The Sum is "+ sum);
    }
    
}
