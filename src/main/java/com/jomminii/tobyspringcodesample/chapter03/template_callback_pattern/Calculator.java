package com.jomminii.tobyspringcodesample.chapter03.template_callback_pattern;

public class Calculator {

    void runCalculator(CalculateStrategy strategy, Integer valueOne, Integer valueTwo) {
        System.out.println("start");
        Integer result = strategy.calculate(valueOne, valueTwo);
        System.out.println("result = " + result);
        System.out.println("end");
    }
}
