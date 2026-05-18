class student {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name + " " + age);
    }

}


public class polymorphism {
    static void main(String[] args) {
        student s1 = new student();
        s1.age = 20;
        s1.name = "Vraj";

        s1.printInfo(s1.name);
    }
}
