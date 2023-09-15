package org.example;

import org.example.functions.MathFunction;

public interface Calculator {
    double doCalculation(String functionName, double arg);

    double doCalculation(String functionName, double arg1, double arg2);

    void addFunction(MathFunction function);

    void listMathFunction();
}
