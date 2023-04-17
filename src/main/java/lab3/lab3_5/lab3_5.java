package lab3.lab3_5;

public class lab3_5 {
        public static void main(String[] args) {
            IntSequence sequence = IntSequence.constant(1);
            while (sequence.hasNext()) {
                System.out.printf("%d ",sequence.next());
            }
//            int number= 1;
//            IntSequence sequence = () -> number;
//            while (sequence.hasNext()) {
//                System.out.printf("%d ",sequence.next());
//            }
        }
}
