// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
           while(true) {
       System.out.println(" Enter a number(press anything less than 0 to quit): ");
       
      int num = scan.nextInt();
      if (num < 0 ){
             break;
         }
      System.out.println(factorial(num));
      
       }
    }
        public static int factorial(int number){
            int total = 1; 
            
            for (int i = 1; i <= number; i++) {
           total = total * i;
            }
            
            if (number <0){
  
                System.out.println ("Invalid number");
            }
            return total;
        }
     }

       
