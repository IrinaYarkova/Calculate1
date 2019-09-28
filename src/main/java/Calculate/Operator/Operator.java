package Calculate.Operator;

public abstract class Operator {
    String name;
    float result = 0;

    public Operator(String name) {
    this.name = name;
    }
    public Operator(){

    }

    public String getName() {
        return name;
    }
}
