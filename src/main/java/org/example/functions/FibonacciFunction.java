package org.example.functions;

import java.util.Scanner;

public class FibonacciFunction implements SingleArgMathFunction {
    public static String name = "Fibonacci";

    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        int f1 = 0;
        int f2 = 1;
        int f3;
        int sum = f1 + f2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the highest number of Fibonacci series:");
        int count = scanner.nextInt();

        System.out.print(f1 + " " + f2);
        for (int i = 2; i < count; i++) {
            f3 = f1 + f2;
            sum += f3;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }
        System.out.println("\nSum of the Fibonacci series: " + sum + "\n");

        return sum;
    }
}
