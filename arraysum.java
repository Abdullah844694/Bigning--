package javaapplication23;

public class arraysum {

    public static void main(String[] args) {
        
       int [] arr = {10,20,30,40,50};
       
         int sum = 0;
         
        System.out.println(arr.length);
        
        
        for(int i = 0;i<arr.length;i++){
            
            sum = sum + arr[i];
        
        
        }
        System.out.println("The Sum is "+ sum);
    }
    
           
}
