
package javaapplication23;
import java.util.Scanner;
public class digitsum {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        int digit = 0;
        int sum = 0;
        
        while(num > 0)
        {
            digit = num % 10;
            
            sum = sum + digit;
            
            num = num/ 10;
        }
        
        System.out.println("Thw Sum is"+ sum);
    }
    
}
