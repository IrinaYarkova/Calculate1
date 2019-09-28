package com.company;

import com.company.Operator.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner in = new Scanner(System.in);

        Addition Add = new Addition("+");
        Subtraction Sub = new Subtraction("-");
        Multiplication Mul = new Multiplication("*");
        Segmentation Seg = new Segmentation("/");
        float result = 0;

        //Ввод входных данных
        System.out.print("Введите первое число: ");
        float number1 = in.nextFloat();
        System.out.print("Введите второе число: ");
        float number2 = in.nextFloat();
        System.out.print("Введите операцию: \n '+' сложение \n '-' вычитание \n '*' умножение \n '/' деление\n");
        String operator = in.next();

        if (operator.equals(Add.getName())){
            result = Add.add(number1, number2);
        } else  if (operator.equals(Sub.getName())){
            result = Sub.subtract(number1, number2);
        } else if (operator.equals(Mul.getName())){
            result = Mul.multipcat(number1, number2);
        } else if (operator.equals(Seg.getName())){1
            result = Seg.segment(number1, number2);
        }

        System.out.printf("Результат вычисления: \n %f %s %f = %.4f", number1, operator, number2, result);

    }

}
