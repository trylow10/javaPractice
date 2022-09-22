package designpattern.singleton;

import designpattern.singleton.Singleton;

public class SingletonKoChora {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.displayMsg();
    }
}
