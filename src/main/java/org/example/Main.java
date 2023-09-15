package org.example;

import org.example.functions.*;

import java.util.Scanner;

/**
 * Practice for my lesson from Udemy course of Akin Kaldiroglu
 *
 * @author Farida Fatali
 * Calculator App using Math functions in Java:
 * Sinus, Cosinus, Log, Square, Cube and Fibonacci series sum of numbers with one and two arguments.
 */

public class Main {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);

        Calculator calculator1 = new FlexCalculator(7);
        calculator1.addFunction(new SinFunction());
        calculator1.addFunction(new CosFunction());
        calculator1.addFunction(new LogFunction());
        calculator1.addFunction(new ExponentialFunction());
        calculator1.addFunction(new SquareFunction());
        calculator1.addFunction(new CubeFunction());
        calculator1.addFunction(new FibonacciFunction());

        startCalculator(calculator1);
    }

    private static void startCalculator(Calculator calculator) {
        calculator.listMathFunction();
        System.out.println("Please enter the name of the function (or \"x\" for exit):");
        String functionName = in.next();
        if (functionName.equalsIgnoreCase("x")) {
            System.out.println("Bye!");
            System.exit(0);
        }
        System.out.println("Number of the arguments:");
        String argumentCount = in.next();

        double functionArg1;
        double functionArg2;
        if (argumentCount.equals("1")) {
            if (functionName.equalsIgnoreCase("fibonacci")) {
                FibonacciFunction function = new FibonacciFunction();
                function.calculate(0);
            } else {
                System.out.println("Please enter the argument of the function:");
                functionArg1 = in.nextDouble();
                double result = calculator.doCalculation(functionName, functionArg1);
                System.out.println(functionName + " of " + functionArg1 + " is " + result + "\n");
            }

        } else {
            System.out.println("Please enter the first argument of the function:");
            functionArg1 = in.nextDouble();
            System.out.println("Please enter the second argument of the function:");
            functionArg2 = in.nextDouble();
            double result = calculator.doCalculation(functionName, functionArg1, functionArg2);
            System.out.println(functionName + " of " + functionArg1 + " and " + functionArg2 + " is " + result + "\n");
        }
        startCalculator(calculator);
    }
}