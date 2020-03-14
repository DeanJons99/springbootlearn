package designpattern.singleton;

public class SingletonType2 {
    private SingletonType2() {

    }

    private static SingletonType2 instance;

    static {
        instance = new SingletonType2();
    }

    public static SingletonType2 getInstance() {
        return instance;
    }
}
