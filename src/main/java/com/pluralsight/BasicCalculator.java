package com.pluralsight;
    import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // First Number
        System.out.println("Enter first number: ");
        double number1 = inputScanner.nextDouble();

        // Second Number
        System.out.println("Enter second number: ");
        double number2 = inputScanner.nextDouble();

        // Operator input
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(D)ivide");
        System.out.println("(M)ultiply");
        System.out.println("Please select an option: ");
        String option = inputScanner.next();

        // Variable holding the answer
        double result = 0;
        String operator = "";

        // Equations with results
        if (option.equals("A")) {
            result = number1 + number2;
            operator = "+";
        }
        if (option.equals("S")) {
            result = number1 - number2;
            operator = "-";
        }
        if (option.equals("D")) {
            result = number1 / number2;
            operator = "/";
        }
        if (option.equals("M")) {
            result = number1 * number2;
            operator = "*";
        }

        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
    }
}
