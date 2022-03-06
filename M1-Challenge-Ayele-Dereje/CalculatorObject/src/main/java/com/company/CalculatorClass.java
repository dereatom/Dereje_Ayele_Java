package com.company;

public class CalculatorClass {

    public int addTwoInt(int x, int y) {
        return x+y;
    }

    public int divideTwoInt(int x, int y) {
        if(y==0){
            return 0;
        }
        return x/y;
    }

    public int subtractTwoInt(int x, int y) {
        return x-y;
    }

    public int multiplyTwoInt(int x, int y) {
        return x*y;
    }

    public double addTwoDouble(double x, double y) {
        return x+y;

    }

    public double multiplyTwoDouble(double x, double y) {
        return x * y;
    }

    public double divideTwoDouble(double x, double y) {
        if(y==0){
            return 0;
        }
        return x/y;
    }

    public double subtractTwoDouble(double x, double y) {
        return x-y;
    }
}
