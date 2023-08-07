package com.example.lib;

public class MyClass {
    // the main method is the entry point for the program
    // every main method starts with these key words: public static void
    // string and args are the parameters for the main method. Here, the main method accepts an array of strings called args.
    public static void main(String[] args) {

        // java output to console
        System.out.print("helloo! ");

        // a variable is a container that store information.
        // values are assigned using the =.
        // Before the name of the variable is a keyword "int" which distinguishes the type of information stored in the variable.
        int age = 125;

        // java output to console
        System.out.print("I am " + age + " years young!");

        // byte is a primitive data type that stores whole numbers -128 to 127. Useful for minimal memory usage.
        byte x = 126;
        // short is a 16 bit primitive data type that stores whole numbers -32,768 to 32,767.
        short y = 126;
        // int is a primitive data type that stores whole numbers -2147483648 to 2147483647.
        int z = 126;
        // long is a 64 bit primitive data type that stores whole numbers -9223372036854775808 to 9223372036854775807.
        long q = 1267298358468675928L;

        // float data type is a 32 bit single procession floating point number. End with "f" or "f".
        float pi = 3.14F;
        // double data type is a 64 bit double procession floating pont number. This is more precise and have a higher procession that float.
        double pi2 = 3.14159;
        // boolean is a primitive data type
        boolean isRaining = true;

        // char: holds only one single number, symbol, or letter.
        char tab = '\t';

        // Type Casting: is the process of converting a value from one data type to another.
        // implicit type casting:
        int numInt = 10;
        double numDouble = numInt; // converted to 10.0
        // explicit type casting:
        double numpi = 3.14;
        int numPI = (int) pi; // converted to 3 with a data loss of .14
        // type casting different data types:
        int myInt = 5;
        char myChar = (char) (myInt + 'A'); // adds value of A according to Ascii table, returns 70
        //System.out.print(myChar);

        // String variables ('data structures' or 'data types') are not primitive data types.
        // Strings are objects from classes.
        String sayHello = "\nhowdy";
        System.out.println(sayHello);
        // combine multiple stings using the concatenation operator '+'
        String myPartner = "partner!";
        System.out.println(sayHello + " " + myPartner);
        // use the length method included in the strong objects to find the length of a string.
        int length = myPartner.length();
        System.out.println("the length is: " + length);

        // conditional statements allow you to make decisions in your code based on certain criteria/conditions.
        // your program can execute specific blocks of code when specified conditions are met (true or false).
        // if statement:
        int myAge = 18;
        if (myAge >= 18) {
            System.out.println("you are an adult");
        }
        // if-else statement:
        int yourAge = 15;
        if (yourAge >= 18) {
            System.out.println("you are an adult");
        } else {
            System.out.println("you are a minor");
        }

        // else-if statement:
        int reishiAge = 60;
        if (reishiAge >= 18 && reishiAge <= 59) {
            System.out.println("you are an adult");
        } else if (reishiAge == 60) {
            System.out.println("you are a senior");
        } else {
            System.out.println("you are a minor");
        }

        // Switch statements are useful for multiple cases that require different actions be executed based on the value of a variable.
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("unknown");
                break;
        }

        // while loops repeats a block of code while specific condition is TRUE.
        // powerful tool for repetitive tasks or performing actions while certain conditions are met.
        int number = 1;
        while (number <= 5) {
            //code to be executed repeatedly
            //as long as condition is true
            System.out.println(number);
            number++;
        }

        // for loop is versatile and commonly used to repeat a block of code X amount of times.
        // it's especially useful when you know in advance how many times you want the loop to execute.
        // for(initialization; condition; update){code to be executed repeatedly}
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        // a continue statement breaks one iteration in the loop if a specified condition occurs
        // and continues with the net iteration in the loop.
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                continue; // this will jump to the top of the code while skipping the print line and continue to the next iteration.
            }
            System.out.println(i);
        }

        // arrays are used to store multiple values of the same data type in a single variable.
        // they are containers that can hold a fixed number of elements
        // and each element in the array can be accessed using an index.
        // dataType[] arrayName = new dataType[arraySize];
        int[] numbersArray = new int[5];

        // storing values in the array
        numbersArray[0] = 10;
        numbersArray[1] = 11;
        numbersArray[2] = 12;
        numbersArray[3] = 13;
        numbersArray[4] = 14;

        // accessing elements in the array and printing them
        System.out.println("Element at index 0: " + numbersArray[0]);

        // for each loop, aka Enhanced for loop, is a convenient and concise way to iterate
        // through elements in the array or collection. For each loop is ideal for arrays.
        // for(dataType element : collection){
        // code to be executed for each element in the collection}
        for (int num : numbersArray) {
            System.out.println(num);
        }

        // a multidimensional array is an array of arrays.
        // it allows you to create a table-like structure where elements are arranged in rows and columns.
        // dataType[][] arrayName = new dataType[numOfRows][numOfCols];
        int[][] myMatrix = new int[3][3];

        // storing values in the 2D array
        myMatrix[0][0] = 1;
        myMatrix[0][1] = 2;
        myMatrix[0][2] = 3;
        myMatrix[1][0] = 4;
        myMatrix[1][1] = 5;
        myMatrix[1][2] = 6;
        myMatrix[2][0] = 7;
        myMatrix[2][1] = 8;
        myMatrix[2][2] = 9;

        // accessing elements in the 2D array & printing them
        System.out.println(myMatrix[2][0]);

        // another way to create and initialize a 2D array:
        // int[][] myMatrix = {
        //          {1,2,3},
        //          {4,5,6},
        //          {7,8,9}
        //          };

        //Calling Methods from examples below:
        //It must be called inside of the main method!
        sayHello();

        //calling a method created below.
        int w = addNumbers();
        System.out.println("the value of 'w': "+w);
        // it could also be written this way to return same results:
        // System.out.println("the value of W: " +addNumbers());

        // if a method is created with parameters, the corresponding values must be passed while calling the method.
        System.out.println("the value of W: " +addNumbers(10, 20));

    }

    // methods: a method is a block of code that performs a specific task.
    // The two types of methods are: User-defined methods and Standard Library Methods.
    // The "returnType" specifies what type of value a method returns.
    // Declaring a java method:
        // returnType methodName(){
        //      method body
        // }
    static void sayHello(){
        System.out.println("my first method");
    }
    // a java method may or may not return a value to the function call.
    //
    static int addNumbers() {
        int x = 10;
        int y = 20;
        int z = x + y;

        return z;
        // you could also write it this way:
            // int x = 10;
            // int y = 20;
            // return x + y;
    }
    // a method parameter is a value accepted by the method and is placed inside the parentheses of the methodName().
    // if a method is created with parameters, the corresponding values must be passed while calling the method.
    static int addNumbers(int x, int y) {
        return x + y;
    }
    }