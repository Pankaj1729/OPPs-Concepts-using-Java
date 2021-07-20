package oopsbasics;

import encapsulation.EncapsulationInfo;

//In a java file we have only one public class(but many class without public keyword) and file name same as the class name

public class MainClass {
    public static void main(String[] args) {

        /*
         * create a Person class object and we access all the property and behaivour of
         * this class using object(like Person class have two properties name and age)
         */
        // "new" keyword is used to create object in java.
        // Person() it call the default constructor(these are used to create new
        // objects)
        // Person p1 = new Person();
        // p1.age = 22;
        // p1.name = "Pankaj";

        Person p2 = new Person(21, "Anjali Gupta");

        /*
         * p2.age = 21; p2.name = "Anjali";
         */

        // System.out.println(p1.age + " " + p1.name);
        // p1.eat();

        System.out.println(p2.age + " " + p2.name);
        p2.walk();
        p2.walk(154);

        // count is static variable.
        // System.out.println(Person.count);

        // Developer class object
        // Developer d1 = new Developer(22, "Pankaj");
        // d1.doWork();
        // d1.walk();

        // Work on Encapsulation File
        // 1.Object creation for Encapsulation class

        EncapsulationInfo obj = new EncapsulationInfo();

        obj.doWork();

    }

}

// child class(Inheritance) ******
class Developer extends Person {

    // constructor
    public Developer(int age, String name) {

        // super() keyword used to call the parents class constructor
        super(age, name);
    }

    // Runtime Polymorphism(child class have same method with same name and
    // signature) ******
    void walk() {
        System.out.println("Developer " + name + " is walking.");
    }
}

// class doesn't take memory at runtime if we cann't create its object and it
// takes memory only in program memory.

class Person {
    // Properties of a class
    String name;
    int age;
    // static means it is now a person class property not object property. and it
    // means we do not want to create object
    // to access it like main method we can access it with class name.
    static int count;

    // Creation of Constructor
    // we can use it to initialize the class property

    // public Person(){
    // count++;
    // System.out.println("creating an object");
    // }

    // Constructor overloading

    public Person(int age, String name) {
        // to call default constructor we use "this()" keyword
        // this();
        // this for class property
        this.age = age;
        this.name = name;
    }

    // Behaiviour of a class
    void eat() {
        System.out.println(name + " is eating.");
    }

    // Here we use "POLYMORPHISM"(Compile time polymorphism) on walk function.
    // *******
    void walk() {
        System.out.println(name + " is walking.");
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps.");
    }

    void doWork() {
        System.out.println(name + " is working.");
    }
}