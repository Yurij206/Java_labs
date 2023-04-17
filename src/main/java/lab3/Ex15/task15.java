import java.util.Random;
public class task15 {
    public interface IntSequence {
        boolean hasNext();
        int next();
    }
    private static Random generator = new Random();
    public static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }
    public static class RandomSequence implements IntSequence {
        private int low, high;
        RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }
        public int next() {
            return low + generator.nextInt(high - low + 1);
        }
        public boolean hasNext() {
            return true;
        }
    }
    public static void main(String[] args) {
        IntSequence sequence = randomInts(1, 10);
        for (int i = 0; i < 10 && sequence.hasNext(); ++i) {
            System.out.println(sequence.next());
        }

    }
}