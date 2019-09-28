package Calculate.Operator;
import Calculate.DivNullException;

public class Division extends Operator {

    public Division(String name) {
        super(name);
    }

    public Division(){

    }

    public float div(float num1, float num2) throws DivNullException {
        if(num2 == 0) {
            throw new DivNullException();
        } else {
            result = num1 / num2;
            return result;
        }
    }
}
