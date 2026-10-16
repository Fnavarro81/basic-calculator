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
        char A = '+';
        System.out.println("(S)ubtract");
        char S = '-';
        System.out.println("(D)ivide");
        char D = '/';
        System.out.println("(M)ultiply");
        String M = "*";
        System.out.println("Please select an option: ");
        String operator = myScanner.next();

        // Equation
        String sum = num1 + " " + operator + " " + num2;
        System.out.println(sum);


    }
}
