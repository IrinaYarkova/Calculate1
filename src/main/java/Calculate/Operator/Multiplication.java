package Calculate.Operator;

public class Multiplication extends Operator {

    public Multiplication(String name) {
        super(name);
    }

    public Multiplication(){

    }

    public float multiply(float num1, float num2){
        result = num1 * num2;
        return result;
    }
}
