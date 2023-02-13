package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 * @author Rogério de F. Pereira
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static volatile SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){ 
        return InstanceHolder.instancia;
    }
}
