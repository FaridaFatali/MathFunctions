package org.example.functions;

public class ExponentialFunction implements DoubleArgMathFunction {
    private static String name = "Exp";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg1, double arg2) {
        return Math.pow(arg1, arg2);
    }
}