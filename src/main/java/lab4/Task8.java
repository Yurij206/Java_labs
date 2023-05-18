import java.util.HashSet;
import java.util.Set;
public class Task8 {
    public static void main(String[] args) {
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

        System.out.println(void.class.getName());
        System.out.println(byte.class.getName());
        System.out.println(int.class.getName());
        System.out.println(double.class.getName());
        System.out.println(float.class.getName());
        System.out.println(char.class.getName());
        System.out.println("-----------------------------");
        System.out.println(byte[].class.getName());
        System.out.println(int[].class.getName());
        System.out.println(double[].class.getName());
        System.out.println(float[].class.getName());
        System.out.println(char[].class.getName());
        System.out.println(String.class.getName());
        System.out.println(Object[].class.getName());
        System.out.println(int[][][][][][][].class.getName());
        System.out.println("-----------------------------");
        System.out.println(Human.class.getName());
        System.out.println(Human.class);
        System.out.println(Object.class.getName());
        System.out.println(Object.class);
        System.out.println(Integer.class.getName());
        System.out.println(Integer.class);
    }
}