package br.com.dio.designpatterns.strategy;

public class StrategyB implements Strategy {

    @Override
    public void execute() {
        System.out.println("Executando estratégia B");
    }
}
