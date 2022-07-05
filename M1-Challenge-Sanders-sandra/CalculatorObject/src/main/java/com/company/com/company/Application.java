package com.company.com.company;

import com.company.Calculator;
import com.company.Calculator.Division;

public class Application {
    Calculator calculator;

    public Application() {
        calculator = new Calculator(
                new Calculator.Addition(),
                new Calculator.Subtraction(),
                new Calculator.Multiplication(),
                new Division()
        );
    }
}
