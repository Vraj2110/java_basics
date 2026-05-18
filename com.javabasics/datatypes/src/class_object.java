class pen{
    String color;
    String type; //ballpoint,gel

    public void write(){
        System.out.println("write something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public  void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

//    Student(){
//        System.out.println("constructor called");
//    } //non parameter
//    Student(String name, int age){
//        this.name =name;
//        this.age = age; //paramter constuctor
//    }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age; //copy constructor which is use to copy some other object functions or entity
    }
    Student(){ // we have to also definne constructor for student 1

    }
}

public class class_object {
    public static void main(String[] args){

        Student s1 = new Student(); //("vraj",12); use this if paramter constructor
        s1.age = 19;
        s1.name = "raj";

        Student s2 = new Student(s1); //this is how we define a copy constructor

        s2.printinfo();
    }
}
