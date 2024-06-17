package OOPS;

class Animal {
    public void walk() {
        System.out.println("Animals are walk on one or more than one leg ");
    }
}

class Cow extends Animal {
    public void legs() {
        System.out.println("cow has 4 legs ");
    }
}

public class inheritence {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.walk();
        c1.legs();

    }

}






