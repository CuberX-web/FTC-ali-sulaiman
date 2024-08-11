package domain;

import java.util.Scanner;

public class HelloWorld {

public static rectangle rec = new rectangle();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter length: ");
        
         rec.length = scan.nextInt();
        
        System.out.println("enter width: ");
        
         rec.width = scan.nextInt();
         
        System.out.println("The perimeter is: " + rec.perimeter());
         
         System.out.println("The area is: " + rec.area());
        
    }
        

}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  package domain;

public class rectangle {
    
    public double length;
    
    public double width;
    
    public double perimeter() {
        
        double Perimeter = length + width + length + width;
        return Perimeter;
    }
    
     public double area() {
          double Area = length * width;
          return Area;
     }
}
