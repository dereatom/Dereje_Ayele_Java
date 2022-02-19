package com.company;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public int divide(int a, int b) {
        if(b==0){
            return 0;
        }
        return a/b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public double add(double a, double b) {
        return a+b;

    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if(b==0){
            return 0;
        }
        return a/b;
    }

    public double subtract(double a, double b) {
        return a-b;
    }
}
