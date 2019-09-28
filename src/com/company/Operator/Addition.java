package com.company.Operator;

public class Addition extends Operator{

    public Addition(String name) {
        super(name);
    }

    public float add(float num1, float num2){
        result = num1 + num2;
        return result;
    }

}
