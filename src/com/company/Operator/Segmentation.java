package com.company.Operator;

public class Segmentation extends Operator {

    public Segmentation(String name) {
        super(name);
    }

    public float segment(float num1, float num2){
        result = num1 / num2;
        return result;
    }
}
