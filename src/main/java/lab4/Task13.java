import java.lang.reflect.Method;
public class Task13 {
    public static void main(String[] args) throws Exception {
        print(Math.class.getMethod("sqrt", double.class), 1, 10, 1);
        print(Double.class.getMethod("toHexString", double.class), 1, 10, 1);
    }
    public static void print(Method m, double lower, double upper, double step) throws Exception {
        System.out.println(m.getDeclaringClass().getCanonicalName() + "." + m.getName());
        for (double i = lower; i <= upper; i += step) {
            System.out.printf("%.2f | %s\n", i, m.invoke(null, i));
        }
    }
}