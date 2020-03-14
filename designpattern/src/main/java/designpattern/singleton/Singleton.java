package designpattern.singleton;

public class Singleton {
    private Singleton() {

    }
    //静态内部类，线程安全
    private static class SingletonInner {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInner.instance;
    }
}
