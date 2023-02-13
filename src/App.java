import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {

        //Singleton
        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        SingletonLazy lazy2 = SingletonLazy.getInstancia();

        System.out.println(lazy1 == lazy2 ? "Mesma instância lazy" : "Insâncias lazy diferentes");

        SingletonEager eager1 = SingletonEager.getInstancia();
        SingletonEager eager2 = SingletonEager.getInstancia();

        System.out.println(eager1 == eager2 ? "Mesma instância eager" : "Insâncias eager diferentes");

        SingletonLazyHolder lazyHolder1 = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstancia();

        System.out.println(lazyHolder1 == lazyHolder2 ? "Mesma instância lazy holder" : "Insâncias lazy holder diferentes");


        //Strategy
        Robo robo = new Robo();
        robo.mover();
        robo.mover();
        robo.serDefensivo();
        robo.mover();
        robo.serAgressivo();
        robo.mover();
        robo.mover();
        robo.mover();
        

        // Facade
        Facade facade = new Facade();
        facade.migraCliente("Rogério", "58000-000");
    }
}
