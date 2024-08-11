// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
           while(true) {
       System.out.println(" Enter a number(press 0 to quit): ");
       
      int num = scan.nextInt();
      System.out.println(factorial(num));
      if (num == 0){
             break;
         }
       }
    }
        public static int factorial(int number){
            int total = 1; 
            
            for (int i = 1; i <= number; i++) {
           total = total * i;
            }
            return total;
        }
    }
       
