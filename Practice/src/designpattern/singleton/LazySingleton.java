package designpattern.singleton;

public class LazySingleton {
    public static LazySingleton singletonInstance;
    private LazySingleton() {
    }
    public static LazySingleton getSingletonInstance() {
        if (null == singletonInstance) {
            singletonInstance = new LazySingleton();
        }
return singletonInstance;
    }
    public void printSingleton() {
        System.out.println("Lazy singleton done");
    }
}
class Test{
    public static void main(String[] args) {
        LazySingleton lazy = LazySingleton.getSingletonInstance();
        lazy.printSingleton();
    }
}