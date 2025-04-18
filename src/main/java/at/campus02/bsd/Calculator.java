package at.campus02.bsd;

public class Calculator {
    private double number1;
    private double number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        return number1 / number2;
    }
}
