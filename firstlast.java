/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;


public class firstlast {

    
    public static void main(String[] args) {
      int a[] = {45,54,98,88,78};
      int max = a[0];
      
        for (int i = 1; i < a.length; i++) {
            if (a[i]> max) {
                max = a[i];
                
            }
           
        }
        System.out.println(max);
    }
    
    
}
