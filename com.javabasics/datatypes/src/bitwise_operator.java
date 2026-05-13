public class bitwise_operator {
    static void main(String[] args) {

        int  a = 5;//0101
        int  b = 3;//0011
                   //0001

        //AND(&) operator  both 1 = 1 if not then 0
        System.out.println("5 & 3 "+(a & b));
        System.out.println("Binary: " + Integer.toBinaryString(a&b));

        //OR(|) operator , if either of the bits is 1, it gives 1, else it shows 0.
        System.out.println("5 | 3" + (a | b));
        System.out.println("Binary:" + Integer.toBinaryString(a|b));

        //XOR(^) operator  if corresponding bits are different, it gives 1, else it shows 0.
        System.out.println("5 ^ 3" + (a ^ b));
        System.out.println("Binary :" + Integer.toBinaryString(a^b));

        //NOT(~) operator  0->1 and 1->0
        System.out.println("~5" + ( ~a));
        System.out.println("Binary:" + (Integer.toBinaryString(~a)));


        //left shift >> one bit are replace with next left bit
        //right shift << one bit are replace with next right bit

    }
}
