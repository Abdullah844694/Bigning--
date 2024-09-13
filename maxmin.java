package javaapplication23;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Declare an array of size 'n'
        int[] arr = new int[n];
        
        // Input elements in the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Initialize max and min with the first element of the array
        int max = arr[0];
        int min = arr[0];
        
        // Traverse through the array to find max and min
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // Output the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        
        scanner.close();
    }
}
