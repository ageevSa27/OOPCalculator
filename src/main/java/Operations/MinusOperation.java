package Operations;

public class MinusOperation implements Operation{
    private Double num1, num2;

    public MinusOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double operate() {
        return num1 - num2;
    }
}

