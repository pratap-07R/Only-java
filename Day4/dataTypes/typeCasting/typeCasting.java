// package typeCasting;

public class typeCasting {
    public static void main(String[] args) {
        
        /*
    JAVA TYPE CASTING
        Type casting is when you assign a value of one primitive data type to another 

        IN java there are two type of type casting 
        1.Widening casting (automatically) =
             converting a smaller type to a larger type size
                byte -> short -> char -> int -> long -> float -> double
        
        2.Narrowing casting(manually) =
            converting a larger type to a smaller size type
                double -> float -> long -> int -> char -> short -> byte

     */

     //widening casting example 
     int age = 22;
     double myAge = age;
     System.out.println(myAge);
    }
}
