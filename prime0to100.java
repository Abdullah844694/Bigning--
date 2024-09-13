package javaapplication23;

public class prime0to100 {

    public static void main(String[] args) {
        System.out.println("Pime numbers between 0 to 100:");
        
        for (int num = 2; num < 100; num++) {
            boolean isprime = true;
            for(int i = 2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isprime =false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(num);
            }
                
        }
    }
}
            

    

    