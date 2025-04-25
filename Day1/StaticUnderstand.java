public class StaticUnderstand {

    // func1(){
    //     System.out.println("Hii");
    // }
   public static void func2(){
        System.out.println("riya");
    }

    void func1(){
        System.out.println("yes riya");
    }     
    // you cant access this function because in static void main only static function are accessble 
    public static void main(String[] args) {
        System.out.println("hello pratap singh ");
        func2();
    }
}
