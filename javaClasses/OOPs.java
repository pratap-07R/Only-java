
// import java.awt.TrayIcon;

// package Only-java.javaClasses;
//create a class
public class OOPs {
     
    int x = 18;
    String name = "virat";
    double marks = 17.2d;

     
    
    public static void main(String[] args) {
        /*
        OPPs stand for object oriented programming 
        => Procedural programming is about writing procedures or methods that perform operations on the data,
           while object-oriented programming is about creating objects that contain both data and methods.
        -> oops is faster and easier to execute
        -> oops provide a clear structure for programm
        -> oops help the code DRY "don't repeat yourself " and make the easier to maintain, modify and debug
        -> oops make it possible to create full reuseable application with less and shorter devlopement time 


        -> Classes and objects are the two main aspects of object-oriented programming.
        class = fruit
        object = apple, banana, mango
         */


         // create an object 
         // -> in java , an object is created from class , we have already created a class name "myNum" so now we can use this to create object 
         // -> to create an object of "myNum", specify the class name, followed by the object name and use the keyword "new"

         OOPs myObj = new OOPs();
         System.out.println(myObj.x);

         //you can also create multiple objects 

         OOPs secObject = new OOPs();
         System.out.println(secObject.name);

         OOPs thirdObject = new OOPs();
         System.out.println(thirdObject.marks);

         // using multiple classes 
         /*
          You can also create an object of a class and access it in another class. 
          This is often used for better organization of classes (one class has all the attributes and methods, 
          while the other class holds the main() method (code to be executed)).
            Remember that the name of the java file should match the class name. In this example, 
            we have created two files in the same directory/folder:

           1. OOPs.java
           2. SecOOPs.java
          */
    }
}
