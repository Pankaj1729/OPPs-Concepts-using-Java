package oopsbasics;

//Abstraction is used to hide the code complexity from user.
public class Abstraction {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.start();

        BMD b1 = new BMD();
        b1.start();
    }
}

class Audi extends Car {

    @Override
    void start() {

        System.out.println("Audi Started");
    }

}

class BMD extends Car {

    @Override
    void start() {
        System.out.println("BMW Started");

    }

}

// if we make a class as abstract then we cann't make its object we can make
// object only for their child.
abstract class Car {
    int price;

    // if we make a method as abstract then we can not provides its defination. we
    // just declare it.and if a method is abstract then its class must be abstract
    abstract void start();

    // we can make normal methods also in a abstract class but not in a interface
    // this methods are called Concreate function.
    void breaks() {
        System.out.println("Apply breaks.");
    }
}
