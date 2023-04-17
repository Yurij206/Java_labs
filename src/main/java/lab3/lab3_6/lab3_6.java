package lab3.lab3_6;

public class lab3_6 {
    public static void main(String[] args) {
        DigitSequence sequence = new DigitSequence(1);
        sequence.remove();
        while (sequence.hasNext()){
            System.out.println(sequence.next());
        }
        sequence.forEachRemaining(Object::toString);
    }
}
