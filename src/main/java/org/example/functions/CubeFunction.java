package org.example.functions;

public class CubeFunction implements SingleArgMathFunction {
    public static String name = "Cube";

    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.pow(arg, 3);
    }
}
