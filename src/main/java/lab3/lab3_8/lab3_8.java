package lab3.lab3_8;

public class lab3_8 {
    public static void main(String[] args) {
        Runnable greeterFirst = new Greeter(5, "first thread");
        Runnable greeterSecond = new Greeter(5, "second thread");
        Thread threadFirst = new Thread(greeterFirst);
        Thread threadSecond = new Thread(greeterSecond);
        threadFirst.start();
        threadSecond.start();
    }
}
