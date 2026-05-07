import java.util.Scanner;

public class test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("maximum value for integer: " + Integer.MAX_VALUE);
//        System.out.println("mininum vvalue for integer: " + Integer.MIN_VALUE);

        System.out.println("Enter a number for a :");
        int a = sc.nextInt();

        int b = 10;
        int c = (a+b);

        System.out.println("total of a + b = "+ c);
    }
}
