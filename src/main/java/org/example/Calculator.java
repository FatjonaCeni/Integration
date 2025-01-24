package org.example;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multi (int a, int b){
        return a *b ;
    }
    public int divide ( int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Divided by zero");
        }
        return a /b;
    }
    public double sqrt(double a){
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take the square root of a negative number");
        }
        return Math.sqrt(a);
    }
}
