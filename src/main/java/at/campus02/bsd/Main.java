package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Created calculator object with 251 and 124");

        Calculator calculator = new Calculator(251, 124);

        calculator.add(251, 124);
        calculator.subtract(251, 124);
        calculator.multiply(251, 124);
        calculator.divide(251, 124);

        logger.info("Program ended");

        System.out.println("Gerome Reise");
    }
}
