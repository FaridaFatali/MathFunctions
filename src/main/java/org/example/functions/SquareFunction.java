package org.example.functions;

public class SquareFunction implements SingleArgMathFunction {
    private static String name = "Square";

    public String getName() {
        return name;
    }

    public double calculate(double arg) {
        return Math.pow(arg, 2);
    }
}
