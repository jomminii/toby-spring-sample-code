package com.jomminii.tobyspringcodesample.chapter03.strategy_pattern;

public class StrategyOne implements Strategy {

    @Override
    public void executeStrategy() {
        System.out.println("Strategy One");
    }
}
