
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("ENter your name");

        String userName = myObj.nextLine();
        System.out.println("Your name is " + userName);

    }
}
