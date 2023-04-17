import java.util.ArrayList;
import java.util.List;
public class task13 {
    private static Runnable runRunnable(List<Runnable> runList) {
        return () -> { for (Runnable runnable : runList) { runnable.run(); }
        };
    }
    public static void main(String[] args) {
        List<Runnable> runnables = new ArrayList<Runnable>();
        for (int i = 0; i < 8; ++i) {
            final int number = i;
            runnables.add(new Runnable() {
                @Override
                public void run() {
                    System.out.println(number + " Is running");
                }
            });
        }
        runRunnable(runnables).run();
    }
}