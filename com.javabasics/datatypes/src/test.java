import java.util.Scanner;

public class test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("maximum value for integer: " + Integer.MAX_VALUE);
//        System.out.println("mininum vvalue for integer: " + Integer.MIN_VALUE);

//        System.out.println("Enter a number for a :");
//        int a = sc.nextInt();
//        int b = 10;
//        int c = (a+b);

//        System.out.println("total of a + b = "+ c);

//        byte a = 30;
//        byte b = 25;
//        byte c = (byte) (a + b);
//
//        System.out.println("total of a and b is:- " + c);

//        float a = 21.0f;
//
//        System.out.println("float minimum value is:-" + Float.MIN_VALUE);
//        System.out.println("float maxium value is:-" + Float.MAX_VALUE);

//        char a = 21;
//        System.out.println("character a minnimum range:" + (int) Character.MIN_VALUE);
//        System.out.println("character a maximum  range:" + (int) Character.MAX_VALUE);
//        System.out.println((char) 20110);

        //System.out.println("widening conversion example");
//        byte byteValue = 10;
//        short shortValue = byteValue;
//        int integerValue = shortValue;
//        long longValue = integerValue;
//        float floatValue = longValue;
//        double doubleValue = floatValue;
//        System.out.println("int: " + integerValue);
//        System.out.println("long:" + longValue);
//        System.out.println("float:" + floatValue);
//        System.out.println("double:" + doubleValue);
//        System.out.println();


        System.out.println("narrowing conversion example");
        double doubleValue2 = 210.123d;
        float floatValue2 = (float) doubleValue2;
        long longValue2  = (long) floatValue2;
        int integerValue2 = (int) longValue2;
        System.out.println("double:" + doubleValue2);
        System.out.println("float:" + floatValue2);
        System.out.println("long:" + longValue2);
        System.out.println("int:" + integerValue2);
        System.out.println();




    }
}
