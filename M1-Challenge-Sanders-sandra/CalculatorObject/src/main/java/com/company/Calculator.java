package com.company;

public class Calculator {

    public Calculator(Addition addition, Subtraction subtraction, Multiplication multiplication, Division division) {
    }

    public Calculator() {

    }

    public int add(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        return a + b;
    }

    public int subtract(int a, int b) {
        int difference = a - b;
        System.out.println(a + " - " + b + " = " + difference);
        return a - b;
    }

    public int multiply(int a, int b) {
        int product = (int) (a * b);
        System.out.println(a + " * " + b + " = " + product);
        return (int) (a * b);
    }


    public int divide(int a, int b) {
        int quotient = (int) (a / b);
        System.out.println(a + " / " + b + " = " + quotient);
        return (int) (a / b);
    }
    public double doubleAdd(double c, double d){
        double sum = c + d;
        System.out.println(c + " + " + d + " = " + sum);
        return c + d;
    }

    public double doubleSubtract(double c, double d) {
        double difference = c - d;
        System.out.println(c + " - " + d+ " = " + difference);

        return c - d;
    }

    public double doubleMultiply (double c, double d){
        double product = c * d;
        System.out.println(c + " * " + d+ " = " + product);
        return c * d;
    }

    public double doubleDivide (double c, double d){
        double quotient = c / d;
        System.out.println(c + " / " + d+ " = " + quotient);
        return c / d;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator(
                new Addition(),
                new Subtraction(),
                new Multiplication(),
                new Division()
        );

        calculator.add(1, 2);
        calculator.subtract(23, 52);
        calculator.multiply(34, 2);
        calculator.divide(12, 3);
        calculator.doubleAdd(3.4, 2.3);
        calculator.doubleSubtract( 5.5, 0.5);
        calculator.doubleMultiply( 6.7, 4.4);
        calculator.doubleDivide( 10.8, 2.2);

    }

    public static class Addition {
    }

    public static class Subtraction {
    }

    public static class Multiplication {
    }

    public static class Division {
    }
}






