class shape{
    public void area(){
        System.out.println("displays Area");
    }
}

class Triangle extends shape{ //single inheritance
    public void area(int l, int h){
        System.out.println( "Trianglr area is:" + 1/2*l*h);
    }
}

class  EquialteralTriangle extends Triangle{ // this is multilevel inheritance son,father,grandfather
    public void area(int l, int h){
        System.out.println( "EquialteralTriangle area is:" + 1/2*l*h);
    }
}

class circle extends shape{  //hirarchical inharitance if we extend same class for multiple base class like here we define shape two time circle and triangle
    public void area(int r){
        System.out.println("Circle area is:" + (3.14)*r*r);
    }
}
public class inheritance {
     public static void main(String[] args) {

         shape s = new shape();
         s.area();
         Triangle t = new Triangle();
         t.area(10,5);

         circle c = new circle();
         c.area(7);



         EquialteralTriangle e = new EquialteralTriangle();
         e.area(6,6);
    }
}
