public class string {

    static void main(String[] args) {

     String a = "Vraj";
//        a = a.toUpperCase();
//        System.out.println(a);//upper case

//        System.out.println("length of string is:" + a.length());//length
//        System.out.println(a.charAt(1));//accesing a character from A index number
//        System.out.println(a.substring(0,2));//substring
        String newText = a.replace("V","p");//character replacement
        System.out.println(newText);
    }
}
