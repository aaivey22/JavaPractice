package com.example.lib;

// method overloading
// multiple methods can have the same name with different parameters.

// Notes: java is an object-oriented programming language.
// The core concept of the object oriented approach is to break complex problems into smaller objects.
// an object is any entity that has a state and behavior.
// an object is an instance of a class.
// a class is a template or blueprint.
// syntax of class creation:
// className object = new className();
//class ClassName {
// fields or states or attributes: store data
// methods or functionalities or behavior: perform operations
//}

// Constructors: a special method used to create and initialize objects when they are first created.
//Modifiers: Access Modifiers are keywords used to control the visibility and accessibility of classes, methods, and fields.
// Four main access modifiers in java: public, private, protected, and default.

// When a class method or field has a Public modifier, it accessible from any other class or package in the application.
// Access modifiers play a crucial role in encapsulation and defining the visibility of various components of your java program.

// A Java package organizes Java classes into namespaces, providing a unique namespace for each type it contains.
// Classes in the same package can access each other's package-private and protected members.


public class Car{
    // states
    public int year;
    public int speed;

    // methods
    public void accelerate() {
        speed += 10;
        System.out.println("new speed is: " + speed);
    }

    public void brake() {
        speed -= 5;
        System.out.println("new speed is: " + speed);
    }

    // constructor
    public Car(int carSpeed, int carYear){
        year = carYear;
        speed = carSpeed;
    }
}