// package Only-java.Day3;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        System.out.println("taking input from user and perform some task");
        System.out.println("ENter your first number :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("ENter your second number: ");
        int num2 = sc.nextInt();
        int multiple = num1 * num2 ;
        System.out.println("multiple of num1 & num2 = "+ multiple);

    }
}
