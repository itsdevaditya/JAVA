package OOPS;

 class Student2 {
    int age;
    String name;

    Student2() {

    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age, String name) {
        System.out.println(age);
        System.out.println(name);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.age = 23;
        s1.name = "Aditya";
        
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.age, s1.name);
    }

}
