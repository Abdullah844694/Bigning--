package javaapplication23;

import java.util.Scanner;
public class swaparray {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i =0 ; i<arr.length ; i++){
            System.out.println("enter the elements");
            arr[i] = sc.nextInt();
        }
        for(int element : arr){
            System.out.println(element + "\t");
        }

        int temp = arr[0];  
        arr[0] = arr[arr.length - 1]; 
        arr[arr.length - 1] = temp;   

        System.out.println("array after swapping");
        
        for(int element : arr){
            
            System.out.println(element + "\t");
        }            
    }    
}
