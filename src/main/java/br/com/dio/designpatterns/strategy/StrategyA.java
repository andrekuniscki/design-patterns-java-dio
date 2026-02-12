package br.com.dio.designpatterns.strategy;

public class StrategyA implements Strategy {

    @Override
    public void execute() {
        System.out.println("Executando estratégia A");
    }
}
