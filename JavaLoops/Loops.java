// package Only-java.JavaLoops;

public class Loops {
    public static void main(String[] args) {
        /*
        => loops can execute a block of code as long as specified condition is reached
        
        +> Loops are handy because they save time , reduce error and they make code readable 
         */

         //java while loop

         /*
        SYNTAX =>
            while (condition) {
                // code block to be executed
        }
        NOTE=> do not forget to increase the variable used in condition , other wish the loop will never end
          */

        int num = 8;
        while(num<10){
            System.out.println(num);
            num++;
        }
        
        // DO/WHILE LOOPS =>
        /*
        The do/while loops is a varieant of while loop , this loop is execute code block once before checking 
        if the condition is true , then it will reapeat till condition is true 

        SYNTAX=>

        do {
          // code block to be executed
        }
        while (condition);
         */

         int i = 0;
         do{
            System.out.println(i);
            i++;
         }
         while(i<6);


         //REAL LIFE EXAMPLE 

        int countdown = 3;
        while(countdown>0){
            System.out.println("countdown"+countdown);
            countdown--;

        }
        System.out.println("Happy new year");



        //ANOTHER ONE

        int dice = 1;

        while(dice<=6){
            if(dice<6){
                System.out.println("yeah its a six");
            }else{
                System.out.println("not yet ");
            }
            dice++;
        }

    }
    
}
