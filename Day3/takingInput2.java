
import java.util.Scanner;

// package Only-java.Day3;

public class takingInput2 {
    public static void main(String[] args) {
        System.out.println("ENter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter your father name: ");
        String fatherName= sc.nextLine();
        System.out.println("ENter your mob number:");
        long mobNo = sc.nextLong();

    }
}


// once we create a scanner class then we use all diifrent positon to take input from user 

/*String -> nextLine()  >> Reads a string value from user
int -> nextInt() >> Reads a integer value from user 
long -> nextLong()  >> Reads a long integer value from user
boolean -> nextboolean() >> reads a boolean value from user 
double -> nextdouble()  >> Reads a double value from user 
*/
