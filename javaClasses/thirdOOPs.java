class myNum{
    int x = 12;
    int y = 19;
}
class yourNum{
    final int z = 18;

}
public class thirdOOPs {
    public static void main(String[] args) {
        myNum num = new myNum();
        //you can access attributes by creating an object of the class and by ussing the dot (.) syntax
        System.out.println(num.y + num.x);

        //you can also modify attribute value 
        num.x = 15; //  set the value of x = 15
        System.out.println(num.x);



        yourNum num1 = new yourNum();
        System.out.println(num1.z);
        //The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
        //The final keyword is called a "modifier".

        myNum obj1 = new myNum();
        myNum obj2 = new myNum();

        obj1.x = 78;
        obj2.x = 56;
        //chage the value of x = 78 for obj1 and x = 56 for obj2

        System.out.println(obj1.x+obj2.x);

    }
}
