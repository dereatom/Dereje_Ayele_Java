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

    public double addDoubles(double a, double b) {
        return a+b;

    }

    public double multiplyDoubles(double a, double b) {
        return a * b;
    }

    public double divideDoubles(double a, double b) {
        if(b==0){
            return 0;
        }
        return a/b;
    }

    public double subtractDoubles(double a, double b) {
        return a-b;
    }
}
