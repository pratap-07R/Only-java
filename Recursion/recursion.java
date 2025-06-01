public class recursion {

    public static int printNumb(int n){
        if(n==10){
            return 0;  //if here we not creating a condition then our code running infinite and stack over flow occure
        }
        System.out.println(n);
        printNumb(n+1);
        return 0;
    }

    public static void main(String[] args){
    /*
    JAVA RECURSION 
    => recursion is technique of making a function call itself again and again 

    => The developer should be very careful with recursion as it can be quite easy 
             to slip into writing a function which never terminates, or one that uses excess
            amounts of memory or processor power. However, when written correctly recursion can be a
             very efficient and mathematically-elegant approach to programming.
     */

    // int n=0;
    printNumb(0);
    }
}
