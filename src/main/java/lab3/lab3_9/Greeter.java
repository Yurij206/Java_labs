package lab3.lab3_9;

public class Greeter implements Runnable {
    int n;
    String target;
    public Greeter(int number, String tar) {
        this.n = number;
        this.target = tar;
    }
    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello, " + target);
        }
    }
}
