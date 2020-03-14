package designpattern.singleton;

public class SingletonType3 {
    private  SingletonType3() {
    }

    private static SingletonType3 instance;
    //多线程不安全，不可用
    public static SingletonType3 getInstance() {
        if (instance == null) {
            instance = new SingletonType3();
        }
        return instance;
    }

    //线程安全，效率低，每次要获取锁，释放锁
    public static synchronized SingletonType3  getInstance2() {
        if (instance == null) {
            instance = new SingletonType3();
        }
        return instance;
    }

}
