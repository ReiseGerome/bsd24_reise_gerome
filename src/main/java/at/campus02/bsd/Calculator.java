package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private double number1;
    private double number2;

    private static Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double add(double number1, double number2) {
        logger.debug("add methode called with " + number1 + " and " + number2);
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        logger.debug("subtract methode called with " + number1 + " and " + number2);
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug("multiply methode called with " + number1 + " and " + number2);
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        logger.debug("divide methode called with " + number1 + " and " + number2);
        if (number2 == 0) {
            logger.error("divide methode called with zero number");
            throw new ArithmeticException("divide methode called with zero number");
        }
        return number1 / number2;
    }
}
