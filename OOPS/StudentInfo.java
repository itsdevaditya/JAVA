package OOPS;

import javax.sound.midi.Soundbank;

// LEARN CLASS AND OBJECTS

class Student {
    int age;
    String name;

    // CONSTRUCTER -- WITHOUT PARAMEER , WITH PARAMETER AND COPY CONSTRUCTER

    Student(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("CONSTRUCTOR CALLED");

        // System.out.println(age + name );
    }
    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    }

}

public class StudentInfo {
    public static void main(String[] args) {
        Student s1 = new Student(23, "Aditya");
        s1.printInfo();

    }

}
