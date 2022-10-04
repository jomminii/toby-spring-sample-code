package com.jomminii.tobyspringcodesample.chapter03.strategy_pattern;

public class Move {

    void useStrategy(Strategy strategy) {
        System.out.println("start");
        strategy.executeStrategy();
        System.out.println("end");
    }
}
