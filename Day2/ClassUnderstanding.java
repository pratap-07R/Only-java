class girlfriend{
    static void fun1(){
        System.out.println("mujhe baat nahi krni");
    }
    static void fun2(){
        System.out.println("gussa hu mai tumse ");
    }
}
public class ClassUnderstanding {

    static void fun1(){
        System.out.println("yes");
    }
    static void fun2(){
        System.out.println("bolo");
    }

    public static void main(String[] args) {
        System.out.println("Hii Riya");

        fun1();
        fun2();

        girlfriend.fun1();
    }
}

//every time whenever we want to access another class firstly you write your class name and dot then call the functions 