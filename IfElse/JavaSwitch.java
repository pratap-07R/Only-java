
import java.util.Scanner;

// package Only-java.IfElse;

public class JavaSwitch {
    public static void main(String[] args) {
        /*
        JAVA SWITCH STATEMENT
            => instead of writing many if..else statement. you can use the switch statement

            SWITCH statement selects one of many code blocks to be executed

            switch(expression) {
                // code block
                break;
                case y:
                // code block
                break;
                default:
                // code block
                case x:
            }
                */

        System.out.println("Enter your number :");
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("not available");
        }
        

    }
    
}
