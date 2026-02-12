package br.com.dio.designpatterns.singleton;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        // construtor privado
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
