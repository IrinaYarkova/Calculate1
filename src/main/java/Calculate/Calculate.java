package Calculate;


import Calculate.Operator.Addition;
import Calculate.Operator.Division;
import Calculate.Operator.Multiplication;
import Calculate.Operator.Subtraction;

import java.util.Scanner;

public class Calculate {

    static Addition Add = new Addition("+");
    static Subtraction Sub = new Subtraction("-");
    static Multiplication Mul = new Multiplication("*");
    static Division Div = new Division("/");

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        //Ввод входных данных
        System.out.print("Введите первое число: ");
        float number1 = in.nextFloat();
        System.out.print("Введите второе число: ");
        float number2 = in.nextFloat();
        System.out.print("Введите операцию: \n '+' сложение \n '-' вычитание \n '*' умножение \n '/' деление\n");
        String operator = in.next();

        getResult(number1, number2, operator);

    }

    public static void getResult(float number1, float number2, String operator) throws Exception {
        float result;
        if (operator.equals(Add.getName())){
            result = Add.add(number1, number2);
            printResult(number1, number2, operator, result);
        } else  if (operator.equals(Sub.getName())){
            result = Sub.subtract(number1, number2);
            printResult(number1, number2, operator, result);
        } else if (operator.equals(Mul.getName())){
            result = Mul.multiply(number1, number2);
            printResult(number1, number2, operator, result);
        } else if (operator.equals(Div.getName())){
            try {
                result = Div.div(number1, number2);
                printResult(number1, number2, operator, result);
            } catch (DivNullException e){
                System.out.println(e.getTextException());
                e.printStackTrace();
            }
        } else  {
            throw new Exception("Неизвестный оператор!");
        }
    }

    public static void printResult(float num1, float num2, String operator, float res ){
        System.out.printf("Результат вычисления: \n %f %s %f = %.4f", num1, operator, num2, res);
    }

}
