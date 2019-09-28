package com.company.Operator;

public class Subtraction extends Operator{

    public Subtraction(String name) {
        super(name);
    }

    public float subtract(float num1, float num2){
        result = num1 - num2;
        return result;
    }
}
