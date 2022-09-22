package designpattern.singleton;

public class Singleton {

    private final String sparta;
    private static final Singleton instance = new Singleton("sparta");

    private Singleton(String sparta) {
        this.sparta = sparta;
    }

    public static Singleton getInstance() {
        return instance;
    }

    public final void displayMsg() {
        System.out.println("this is " + sparta);
    }
}
