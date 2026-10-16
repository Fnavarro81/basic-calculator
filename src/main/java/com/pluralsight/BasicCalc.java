package com.pluralsight;
    import java.util.*;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // First Number
        System.out.println("Enter first number: ");
        double num1 = myScanner.nextDouble();

        // Second Number
        System.out.println("Enter second number: ");
        double num2 = myScanner.nextDouble();

        // Operator input
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(D)ivide");
        System.out.println("(M)ultiply");
        System.out.println("Please select an option: ");
        String operator = myScanner.next();

        // Variable holding the answer
        double result = 0;

        // Equations with results
        if (operator.equals("A")) {
            result = num1 + num2;
            System.out.println(num1 + "_+ " + num2 + " = " + result);
        }
        if (operator.equals("S")) {
            result = num1 - num2;
            System.out.println(num1 + "_- " + num2 + " = " + result);
        }
        if (operator.equals("D")) {
            result = num1 / num2;
            System.out.println(num1 + "_/ " + num2 + " = " + result);
        }
        if (operator.equals("M")) {
            result = num1 * num2;
            System.out.println(num1 + "_* " + num2 + " = " + result);
        }

    }
}
