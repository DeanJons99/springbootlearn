package designpattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuqiang
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public void before() {
        System.out.println("开始事务。。。");
    }

    public void after() {
        System.out.println("提交事务。。。");
    }
    public Object getProxyInstance() {

        Object proxyObject = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("开始事务。。。");
                        before();
                        Object returnValue = method.invoke(target, args);//调用target方法
//                        System.out.println("提交事务。。。");
                        after();
                        return returnValue;
                    }
                });
        return proxyObject;
    }
}
