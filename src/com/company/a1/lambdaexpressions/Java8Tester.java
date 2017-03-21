package com.company.a1.lambdaexpressions;

public class Java8Tester {

    public static void main(String[] args) {

        Java8Tester tester = new Java8Tester();

        MathOperation addition = (int a, int b) -> (a + b);
        MathOperation subtraction = (int a, int b) -> (a - b);
        MathOperation multiplication = (int a, int b) -> (a * b);
        MathOperation division = (int a, int b) -> (a / b);

        System.out.println(tester.operate(10, 6, addition));
        System.out.println(tester.operate(10, 6, subtraction));
        System.out.println(tester.operate(10, 6, multiplication));
        System.out.println(tester.operate(10, 6, division));

        GreetingService hello = (String name) -> {
            return "Hello " + name;
        };

        System.out.println(hello.greeting("Bob"));

    }

    interface GreetingService {
        String greeting(String name);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}
