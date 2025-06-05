public class main2 {
    int x;


        //constracter parameter => constructor 


    public main2(int y){  //in this line of code 
        x = y;
    }

    public static void main(String[] args) {
        main2 myObj = new main2(7);
        System.out.println(myObj.x);


    }
}
