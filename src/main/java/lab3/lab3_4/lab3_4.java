package lab3.lab3_4;


public class lab3_4 {
    public static void main(String[] args) {
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.printf("%d ", sequence.next());
        }
    }
}
