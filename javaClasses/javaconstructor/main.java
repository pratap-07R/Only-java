// package javaconstructor;

public class main {
    int x; //create a class attribute 

    //create a class constructor for main class    

    public main (){
        x = 5; //set the initial value for the class attributes x 
    }
    public static void main(String[] args) {
        main myObj = new main(); //create an object of class main(this will call constructor)
        System.out.println(myObj.x);
    }

}
/*
Note=>  that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, 
Java creates one for you. However, then you are not able to set initial values for object attributes.
 */