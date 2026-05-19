package bank;

class Account{
   public String name;
   protected String email;
   private String pass;

   public  String getPass(){
       return  this.pass;
   }
   public void setpass(String pass){
       this.pass = pass;
   }
}

public class encapsulation {
    static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Vraj";
        a1.email = "desaivraj18@gmail.com";
        a1.setpass("abcd");
        System.out.println(a1.getPass());
    }
}
