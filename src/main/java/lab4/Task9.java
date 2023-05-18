import java.lang.reflect.Field;
import java.util.*;

public class Task9 {
    public static void main(String[] args) throws Exception {
        class Human
        {
            final String name;
            final int age;

            Human (String name, int age){
                this.name = name;
                this.age = age;
            }
        }
        Human chel = new Human("Chel", 123);
        System.out.println(toString(chel));
    }
    public static String toString(Object obj) throws Exception {
        Class<?> class1 = obj.getClass();
        StringJoiner joiner = new StringJoiner(", ", class1.getName() + " {", "}");
        for (Field field : class1.getDeclaredFields()) {
            field.setAccessible(true);
            joiner.add(field.getName() + "=" + field.get(obj).toString());
        }
        return joiner.toString();
    }
}
