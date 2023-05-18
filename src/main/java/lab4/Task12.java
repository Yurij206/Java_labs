import java.lang.reflect.Method;
import java.lang.Object;
public class Task12 {
    public static void main(String[] args) {
        class TimeTest
        {
            final int value;

            TimeTest(int value)
            {
                this.value = value;
            }
            public int getValue() {
                return  value;
            }
        }

        TimeTest test1 = new TimeTest(1);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            test1.getValue();
        }
        System.out.println("Time:" + (System.currentTimeMillis() - start));

        try {
            start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                test1.getClass().getMethod("getValue").invoke(test1);
            }
            System.out.println("ReferencTime:" + (System.currentTimeMillis() - start));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}