

public class Character {
    public static void main(String[] args) {
        /*
         CHARACTER 
         THE char data type used to store a single character. the charcater should must be shorunded by single qoutes like 'A'

         */

         char myGrade = 'A';
         char myFriendGrade = 'B';
         System.out.println(myFriendGrade);
    

         // Alternatively if you are familiar with ASCII values you can use those to display cirtain characters 
         char myVar1 = 65;
         char myVar2 = 73;
         System.out.println("My Grade: " + myGrade);
         System.out.println("My Friend's Grade: " + myFriendGrade);
         System.out.println("My Variable 1: " + myVar1);
         System.out.println("My Variable 2: " + myVar2);
         System.out.println(myVar2);


         /*
          STRING =>
          the string data type is used to store a sequence of chracters (text). string string value must be srrounded with double qoutes "".
          */

          String hi = "hello pratap how are you";
          System.out.println(hi);


          //REAL LIFE EXAMPLE
          int item = 50;
          float costPerItem = 38.5f;
          float totalcost = costPerItem*item;
          char currency = '$';
          System.out.println("Number of item = "+ item);
          System.out.println("cost per item = "+costPerItem);
          System.out.println("total cost = "+totalcost+currency);


    }
    
}
