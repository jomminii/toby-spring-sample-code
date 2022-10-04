package com.jomminii.tobyspringcodesample.chapter03.template_callback_pattern;

public class Client {

    public static void main(String[] args) {

        Integer valueOne = 3;
        Integer valueTwo = 4;

        Calculator calculator = new Calculator();
        CalculateStrategy multiplyStrategyWithLambda = (one, two) -> {
            return one * two;
        };
        calculator.runCalculator(multiplyStrategyWithLambda, valueOne, valueTwo);

        CalculateStrategy multiPlyStrategyWithAnonymous = new CalculateStrategy() {
            @Override
            public Integer calculate(Integer valueOne, Integer valueTwo) {
                return valueOne * valueTwo;
            }
        };
        calculator.runCalculator(multiPlyStrategyWithAnonymous, valueOne, valueTwo);
    }
}
