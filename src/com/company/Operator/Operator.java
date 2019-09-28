package com.company.Operator;

public abstract class Operator {
    String name;
    float result = 0;

    public Operator(String name) {
    this.name = name;
    }

    public String getName() {
        return name;
    }
}
