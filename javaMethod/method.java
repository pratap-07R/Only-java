// package Only-java.javaMethod;

public class method {


    static void myMethod(){
        System.out.println("hii programmer this is my new method ");
    }

    static void secMethod(String fName){
        System.out.println("hii "+ fName + " how are you ");
    }

    static void thirdMethod(int age){
        if(age > 18){
            System.out.println("you are adult ");
        } else{
            System.out.println("you are not adult");
        }
    }




    public static void main(String[] args) {
        /*
        //METHOD
        -> A method is a block of code which only runs when it is called 
        -> you can pass data , known as parameter , into a method 
        -> method are used to perform certain action and they are also known as function 
        -> why  use methods? to reuse code : define the code once and use many times 


        //create a method 
        -> a method must be declared within a class. it is defined when name of method, followed by pranthisis 
           java provide us some predifind methods like "System.out.println()". 
           but you can also create your own method to perform certain action 

           //example 
                Create a method inside Main:

                public class Main {
                     static void myMethod() {
                          // code to be executed
                    }
                }
                    -> " myMethod() " is name of my method 
                    -> "static" means that the method belongs to the main class and not an object of main class
                    -> "void" means that this method does not have a return value 
        */

        myMethod();

        secMethod(" pratap");
        secMethod(" Riya bhardvaj");
        secMethod(" virat");
        //when a parameter passed to the method, it is called as an argument. so from the example above : fName is parameter and pratap, riya , virat is a argument

        thirdMethod(12);
    }
    
}
