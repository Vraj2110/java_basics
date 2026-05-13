public class logical_operator {
    static void main(String[] args) {

        ////Logical AND Operator (&&)
        System.out.println(1 != 2 &&  1<2);//This operator returns true when both the conditions under consideration are satisfied or are true.If even one of the two yields false, the operator results false.

        //Logical OR Operator (||)
        System.out.println(1 !=2 || 1 < 2);//This operator returns true when one of the two conditions under consideration is satisfied or is true. If even one of the two yields true, the operator results true. To make the result false, both the constraints need to return false.

        //Logical NOT Operator (!)
        System.out.println("1>2=" + !(1>2));//, if the condition is false, the operation returns true and when the condition is true, the operation returns false.
    }
}
