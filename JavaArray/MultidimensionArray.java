// package Only-java.JavaArray;

public class MultidimensionArray {
    public static void main(String[] args) {
        /*
         //MULTIDEMENSION ARRAY
         => A multidimension array is an array of array 
         multidension array are usefull when you want to store data in tablular form 
         like a table with row and coloumn form 

         example =>
         int[][] num = {{1,2,5,33},{34,12,35,2,3}};

         */

         //Access element
         int[][] myNum = {{12,1,34,19,},{23,56,12,23}};
         System.out.println(myNum[0][3]);


         //change element value 
         int[][] value = {{12,43,23,56},{89,34,32,12}};
         value[1][3] = 90;
         System.out.println(value[1][3]);


         //Loop through a multidension array
         String[][] friends = {{"priya,riya,preety"},{"mohit,pratap,abhishek"}};
         for(int i=0; i<=friends.length; i++){
            System.out.println("inner loop"+ friends[i]);
            for(int j=0; j<=friends[i].length; j++){
                System.out.println(" outer loop"+friends[j]);
            }
         }

    }
}
