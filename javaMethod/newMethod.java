// package Only-java.javaMethod;

public class newMethod {


        static int Mymethod(int x){
            return x+7;
        }

        static String secMethod(String fname, String lname){
            return fname+lname;

        }


    public static void main(String[] args) {
        /*
        //return value
        if you want the method to return a value, you can use primitive data type (such as int, char etc ) instead of
        void and use the return keyword inside the method
         */
        System.out.println(Mymethod(18));


        System.out.println(secMethod("virat" , " kohli"));
    }
}
