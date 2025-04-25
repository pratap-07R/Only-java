
import java.util.Scanner;



public class TakingInput {
    public static void main(String[] args) {
       Scanner myobj = new Scanner(System.in);
       System.out.println("Enter your name : ");

       String username = myobj.nextLine();
       System.out.println("your name is ...." + username);
    }
}
