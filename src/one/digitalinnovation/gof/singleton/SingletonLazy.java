package one.digitalinnovation.gof.singleton;

import java.util.Objects;

/**
 * Singleton "preguiçoso"
 * 
 * @author Rogério de F. Pereira
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (Objects.isNull(instancia))
            instancia = new SingletonLazy();
        return instancia;
    }
}
