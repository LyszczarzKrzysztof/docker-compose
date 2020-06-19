package com.example.springbootdockercomposeapi;

public class Calculator {

    public int add(int i, int i1) {
        return i+i1;
    }

    public int divide(int i, int i1) {
        if(i1==0){
            throw new ArithmeticException("It's impossible to divide by '0'");
        }else{
            return i/i1;
        }
    }
}
