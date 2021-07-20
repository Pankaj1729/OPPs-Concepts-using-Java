package oopsbasics;

//to implement interfaces we use implements keyword
public class Interfaces implements NewCar, NewPerson {
    public static void main(String[] args) {
        Interfaces obj = new Interfaces();
        obj.start();
        obj.walk();
    }

    // @Override is an annotation we may or may not write it.
    @Override
    public void start() {
        System.out.println("My Car is starting.");

    }

    @Override
    public void walk() {
        System.out.println("Now it start walking.");

    }
}

// use keyword interface to create an interface
// all method in a interface by-default abstract and public.
// interface provide the true abstraction
interface NewCar {
    void start();
}

interface NewPerson {
    void walk();
}