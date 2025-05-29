// package Only-java.Day4.dataTypes;

public class Numbers {
    public static void main(String[] args) {
        
        /* Integer Types 
           Byte => the byte data tyes store whole numbers from -128 to 127.
           this can be used instead of int or other integer type to save memory        
         */
         
         byte A = 100;                // only store -128 to 127
         short B = 29899;             // the short data types can store whole number from -32768 to 32767
         int C = 1948392838;          // the int data type store whole number from -2147483648 to 2147483647
         long D = 23023209349487L;    // the long data types whole number from -9223372036854775808 to 9223372036854775807.
         //NOTE => you should end the value with "L"
         float E = 3.14f;
         double F = 576.23d;          // the float and double data types store fraction numbers
         //NOTE=> you should end the value with "f" for floating and "d" for double data type
         System.out.println(F);

    }
}
