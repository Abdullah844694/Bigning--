
package javaapplication23;
import java.util.Scanner;
public class prime {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
            
        boolean flag = true;
                    
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                                
            }
        }
        if (flag) 
            System.out.println(num +" is a prime");
        else
            System.out.println(num +" is not");       
    }    
}
