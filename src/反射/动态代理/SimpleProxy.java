package 反射.动态代理;

import java.lang.reflect.Proxy;

/**
 * 客户端代码
 */
public class SimpleProxy {
    public static void useProxy() {
        String str = "Hello World";
        LoggingInvocationHandler handler = new LoggingInvocationHandler(str);
        Comparable obj = (Comparable) Proxy.newProxyInstance(SimpleProxy.class.getClassLoader(), new Class[]{Comparable.class}, handler);
        obj.compareTo("Good");
    }
}
