
import java.util.Scanner;



public class JavaIf {
    public static void main(String[] args) {
        int a = 15;
        int b = 90;
        System.out.println("hello");
        if(b>a){
            // System.out.println("a is greater than b");
        }


        /*
        The else Statement
            Use the else statement to specify a block of code to be executed if the condition is false.
         */

        int time = 20;
        if(time<18){
            // System.out.println("Good day");
        } else {
            // System.out.println("very bad day");
        }


        /*
        THE ELSE IF STATEMENT
            use the else if statement to specify the new condition if the first condition is false
         */
        int time2 = 1;
        if(time2<10){
            System.out.println("good morning");
        } else if(time2<18){
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }


        /*
        java short hand if...else ternary operator
            There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
            It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

            variable = (condition) ? expressionTrue :  expressionFalse;
         */


         int time3 = 23;
         String result = (time3<18) ? "hello" : "what hello";
         System.out.println(result);

         //FIND OUT IF THE NUMBER IS EVEN OR ODD

         System.out.println("enter your number: ");
         Scanner sc = new Scanner(System.in);
        //  sc.close();
         int myNum = sc.nextInt();

         if(myNum%2 == 0){
            System.out.println("even number");
         } else{
            System.out.println("odd number");
         }
         
         



    }
}
