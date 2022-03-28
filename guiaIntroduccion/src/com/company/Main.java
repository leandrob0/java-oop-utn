package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1: ");
        exercise1();

        System.out.println("Exercise 2: ");
        exercise2();

        System.out.println("Exercise 3: ");
        System.out.println(exercise3());

        System.out.println("Exercise 4: ");
        exercise4();

        System.out.println("Exercise 5: ");
        exercise5();

        System.out.println("Exercise 6: ");
        exercise6();

        System.out.println("Exercise 7: ");
        exercise7();

        System.out.println("Exercise 8: ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.next();
        exercise8(name);

        System.out.println("Exercise 9: ");
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        exercise9(number);

        System.out.println("Exercise 10: ");
        System.out.println("Fahrenheit: 120 F . Celsius: " + exercise10(120) + "C");

        scan.close();
    }

    public static void exercise1() {
        int N = 5;
        double A = 5.4;
        char C = 'c';
        int numericOfC = Character.getNumericValue(C);

        System.out.println("N: " + N);
        System.out.println("A: " + A);
        System.out.println("C: " + C);
        System.out.println("N + A: " + (N+A));
        System.out.println("A - N: " + String.format("%.2f", (A-N)));
        System.out.println("Numeric of C: " + numericOfC);
    }

    public static void exercise2() {
        int X = 3;
        int Y = 4;
        double N = 4.65;
        double M = 7.23;

        System.out.println("X - M: " + String.format("%.2f", (X - M)));
        System.out.println("Y * X: " + (Y * X));
        System.out.println("N / X: " + String.format("%.2f", (N / X)));
        System.out.println("Y % X: " + (Y % X));
    }

    public static int exercise3() {
        int N = 3;
        return (((N + 77)-((N + 77) - 3))*2);
    }

    public static void exercise4() {
        int A = 1,B = 2,C = 3,D = 4;
        System.out.println("Before: A: "+A+".B: "+ B+".C: "+C+".D: "+D);
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("After: A: "+A+".B: "+ B+".C: "+C+".D: "+D);
    }

    public static void exercise5() {
        int A = 4;
        if ((A % 2) == 0) {
            System.out.println("A is even");
        } else {
            System.out.println("A is odd");
        }
    }

    public static void exercise6() {
        int A = -3;
        if (A < 0) {
            System.out.println("A is negative");
        } else if(A > 0) {
            System.out.println("A is positive");
        } else {
            System.out.println("A is 0");
        }
    }

    public static void exercise7() {
        int C = 43;
        System.out.println("Number chosen: " + C);
        System.out.println((C > 0) ? "Positive" : (C < 0) ? "Negative" : "Is 0");
        System.out.println((C % 2 == 0) ? "Even" : "Odd");
        System.out.println((C % 5 == 0) ? "Multiple of 5" : "Not multiple of 5");
        System.out.println((C % 10 == 0) ? "Multiple of 10" : "Not multiple of 10");
        System.out.println((C > 100) ? "Greater than 100" : (C < 100) ? "Less than 100" : "Equal to 100");
    }

    public static void exercise8(String name){
        System.out.println("Buenos dias, " + name);
    }

    public static void exercise9(int number){
        System.out.println("Double of the num: " + (number*2) + " - Triple of the num: " + (number*3));
    }

    public static int exercise10(int faren){
        return (faren - 32) * 5/9;
    }

    // me aburri.
}