package lab3.lab3_9;
import java.util.ArrayList;
import java.util.List;

public class lab3_9 {
    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks)
            new Thread(task).start();
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        List<Runnable> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tasks.add(new Greeter(20, ""+ i));
        }
        System.out.println("Method : runTogether");
        runTogether(tasks.toArray(new Runnable[0]));
        System.out.println("Method runInOrder");
        runInOrder(tasks.toArray(new Runnable[0]));

    }


}
