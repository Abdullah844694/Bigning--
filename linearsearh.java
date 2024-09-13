package javaapplication23;
import java.util.Scanner;
public class linearsearh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        int[] arr = {5, 8, 12, 15, 23, 32, 45, 56, 67, 78};
      
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;  
            }
        }
               if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
        
    }
}
