// package Only-java.javaClasses;
class pen {
    String color;
    String type;

    public void write(){
        System.out.println("writting something");
    }
}

public class SecOOPs {
    public static void main(String[] args) {
        // OOPs myObject = new OOPs();
        // System.out.println(myObject.x);

        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel pen";

        pen1.write();

    }
}
