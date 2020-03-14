package designpattern.singleton;

public class SingletonType1 {

    private SingletonType1() {

    }

    private static final SingletonType1 instance = new SingletonType1();

    public static SingletonType1 getInstance() {
        return instance;
    }

}
