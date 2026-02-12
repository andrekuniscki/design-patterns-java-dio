package br.com.dio.designpatterns;

import br.com.dio.designpatterns.singleton.SingletonLazy;
import br.com.dio.designpatterns.strategy.Strategy;
import br.com.dio.designpatterns.strategy.StrategyA;
import br.com.dio.designpatterns.strategy.StrategyB;

public class Main {

    public static void main(String[] args) {

        // Singleton
        SingletonLazy singleton = SingletonLazy.getInstance();
        System.out.println(singleton);

        // Strategy
        Strategy strategyA = new StrategyA();
        Strategy strategyB = new StrategyB();

        strategyA.execute();
        strategyB.execute();
    }
}
