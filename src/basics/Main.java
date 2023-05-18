package basics;

import java.util.Scanner;

public class Main {

    static void example1(){
        System.out.println("Hello");
        System.out.println("Hello world!");
        Car car1 = new Car();
        car1.color = "White";
        car1.horsePower = 100;
        car1.weight = 1000;
        System.out.println(car1.color);

        car1.year = 1234;



    }
    static void example2(){
        new Main().myMethod();
        Main main = new Main();
        main.myMethod();

    }

    static void example3(){

        //Get user input => use Scanner object
        /*
            Scanner exists in package java.util

         */
        Scanner input = new Scanner(System.in);

        //getting user input is done in two-steps
        //step 1: message
        //step2: getting input

        System.out.println("Enter Car make");
        String make = input.next();
        System.out.println("Enter Car model");
        String model = input.nextLine();

        System.out.println("Enter car seats");
        byte seats = input.nextByte();
        System.out.println("Enter car weight");
        double weight = input.nextDouble();
        input.nextLine(); //consumes /nl
        System.out.println("Enter car color");
        String color = input.nextLine();
        System.out.println("What just happened?");

        System.out.println("Thanks for your input");

    }
    void myMethod(){}
    public static void main(String[] args) {

        example3();
    }

}