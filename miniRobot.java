package domain;

public class HelloWorld {

    public static void main(String[] args) {
        
       miniRobot robotMachine = new miniRobot();
       
       robotMachine.Initialize();
       robotMachine.Move();
       robotMachine.Rotate();
    }

}
________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

package domain;

public class miniRobot {
    
   public static void Initialize(){
       
       System.out.println("Initializing...");
       
   }
   public static void Move(){
       
       System.out.println("MOVING...");
       
   }
   public static void Rotate(){
       
       System.out.println("Rotating...");
       
   }
}




