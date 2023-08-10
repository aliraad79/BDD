package calculator;


import static java.lang.Math.pow;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int power(int a, int b) {
        return (int)pow(a, b);
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
