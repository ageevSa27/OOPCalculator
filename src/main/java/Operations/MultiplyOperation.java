package Operations;

public class MultiplyOperation implements Operation {
    private Double num1, num2;

    public MultiplyOperation(Double num1, Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double operate() {
        return num1 * num2;
    }
}