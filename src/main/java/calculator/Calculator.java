package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        do {
            System.out.println("============ DevOps_Calculator-app ::  ================= \n");
            System.out.println("===== Please choose operation from below options :: ===== ");
            System.out.println("Press -1- for -Square root- \n");
            System.out.println("Press -2- for -Factorial- \n");
            System.out.println("Press -3- for -Natural log- \n");
            System.out.println("Press -4- for -Power- \n");
            System.out.println("Press -5- for -Exit- \n");
            System.out.println("Enter your choice :: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }


        switch (choice) {

            case 1:
                // find square root
                System.out.print("Enter a number -> ");
                num1 = scanner.nextDouble();
                System.out.println("Square root of "+num1+" is : " + calculator.sqroot(num1));
                System.out.println("\n");


                break;
            case 2:
                // do factorial
                System.out.print("Enter a number -> ");
                num1 = scanner.nextDouble();
                System.out.println("Factorial of " + num1 + " is : " + calculator.factoral(num1));
                System.out.println("\n");

                break;

            case 3:
                // find natural log
                System.out.print("Enter a number -> ");
                num1 = scanner.nextDouble();
                System.out.println("Natural log of "+num1+" is : " + calculator.naturalLog(num1));
                System.out.println("\n");

                break;

            case 4:
                // find power
                System.out.print("Enter the first number -> ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number -> ");
                num2 = scanner.nextDouble();
                System.out.println(num1+ " raised to power "+num2+" is : " + calculator.power(num1, num2));
                System.out.println("\n");
                break;

            default:
                System.out.println("Exiting....Bye Bye :)");
                return;
            }
        } while (true);
    }

    public double factoral(double num1) {
        logger.info("[FACTORIAL - Value] - " + num1);
        double result = fact(num1);
        logger.info("[FACTORIAL - Result] - " + result);
        return result;
    }
    public double fact(double num1) {
        double value_fact = 1;
        for(int i = 1; i <= num1; ++i)
        { value_fact *= i;   }
        return  value_fact;
    }

    public double sqroot(double num1) {
        logger.info("[SQ ROOT - Value] - " + num1);
        double result = Math.sqrt(num1);
        logger.info("[SQ ROOT - Result] - " + result);
        return result;
    }

    public double naturalLog(double num1) {
        logger.info("[NATURAL LOG - Value] - " + num1);
        double result = 0;
        try {

            if (num1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(num1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[NATURAL LOG - Exception] - log of negative numbers not available" + error.getLocalizedMessage());
        }
        logger.info("[NATURAL LOG - Result] - " + result);
        return result;
    }

    public double power(double num1, double num2) {
        logger.info("[POWER - " + num1 + " RAISED TO] " + num2);
        double result = Math.pow(num1,num2);
        logger.info("[POWER - Result] - " + result);
        return result;
    }

        }
