// package Only-java.JavaLoops;

public class ForLoop {
    public static void main(String[] args) {
        
    
    /*
    when you know exactly how many times you want to loop through a block of code use the for loop instead the while loop 


    SYNTAX
    for (start; till where; increment) {
        // code block to be executed
    }
     */


    for(int i= 0; i<6; i++){
        // System.out.println(i + " * ");
    }



    //NESTED LOOP 
    /*
    Loop inside another loop is called nested loop 
    the "inner loop " will be exwcuted one time for each iteration of "outer loop"

    */

    for(int i =0; i<2; i++){
        // System.out.println("outer loop "+ i);

        for(int j=0; j<4; j++){
            // System.out.println("  inner loop "+ j);
        }
    }

    // For..each loop 
    /*
    "for each also a loop ", which is used exclusevely to loop through elements in an array 

    SYNTAX=>
    for (type variableName : arrayName) {
        // code block to be executed
    }

    YE samjh me nahi aaya hai 

    */
    
    //BREAK STATEMENT
    for(int k=0; k<+10; k++){
        if(k==3){
            break;
        }
        // System.out.println(k+ " *");
    } 

    //Continue=>
    //continue statement break one iteration(in the loop ), if a specified condition occure, and continue with the next iteration in the loop 


    //this example skip the value of 5

    for(int l=0; l<=10; l++){
        if(l==5){
            continue;
        }
        // System.out.println(l+ " *");
    }


     
    }
}
