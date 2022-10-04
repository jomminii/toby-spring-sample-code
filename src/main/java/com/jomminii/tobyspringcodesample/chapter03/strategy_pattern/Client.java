package com.jomminii.tobyspringcodesample.chapter03.strategy_pattern;

public class Client {

    public static void main(String[] args) {
        Strategy strategyOne = new StrategyOne();
        Move moveOne = new Move();
        moveOne.useStrategy(strategyOne);

        Strategy strategyTwo = new StrategyTwo();
        Move moveTwo = new Move();
        moveTwo.useStrategy(strategyTwo);
    }
}
