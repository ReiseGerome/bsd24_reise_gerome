package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double number1 = 10;
        double number2 = 2;

        calculator.add(number1, number2);
        calculator.subtract(number1, number2);
        calculator.multiply(number1, number2);
        calculator.divide(number1, number2);

        System.out.println("Gerome Reise");
    }
}
