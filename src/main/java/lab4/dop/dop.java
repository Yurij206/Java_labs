package lab4.dop;
import lab3.Comparator.MyClass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class dop {
    public static Object proxyLog(Object obj) {
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = method.invoke(obj, args);
                System.out.println("Класс: " + obj.getClass()+ "\nМетод: " + method.getName() +  "\nАргументы: " +Arrays.toString(args) +  "\nРезультат: " +result + "\n" );
                return result;
            }
        };
        return  Proxy.newProxyInstance(obj.getClass().getClassLoader(), interfaces, handler);
    }
}
