// package Only-java.JavaArray;

public class javaArray {
        public static void main(String[] args) {
        /*
        //JAVA ARRAY
            array are used to store multiple value in same data type  in single variable
            => to declair an array define the variable type with squire brakets

            examples
                String[] cars = {"BMW", "mercdies"};
                int[] myNum = {23,45,56,};
         */

         //access the element of an array
         String[] car = {"BMW", "Volvo", "mahindra"};
         System.out.println(car[0]);   //directly car is not printed 


         //change the element of an array 
         int[] rollNum = {23,2,4,12,45,24,};
         rollNum[2] = 7;
         System.out.println(rollNum[2]); //now output "7" instead of "4"


         //find array lenght
         float[] marks = {12.1f,13.5f,11.1f,18.3f,23.2f};
         System.out.println(marks.length);


         //loop through an array 
         String[] bike = {"gt650", "bullet", "ktm", "hero"};
         for(int i=0; i<=bike.length; i++){
            // System.out.println(bike[i]);
         }


         //loop through an array with for each 
         int[] count = {12,34,56,78,90,14,26,};
         for(int i : count){
            System.out.println(i);
         }


         //REAL LIFE EXAMPLE 
         int[] ages = {30,34,1,23,45,53,24,3};
         
         int lenght = ages.length;
         int lowestage = ages[0];
         
         for(int age : ages){
            if(lowestage>age){
                lowestage = age;

            }
         }
         System.out.println("lowest age is "+ lowestage);
    
    }
}
