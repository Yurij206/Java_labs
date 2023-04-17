package lab3.lab3_5;

import java.util.Random;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }
    int next();
    static IntSequence constant(int num) {
        return new IntSequence() {
            private final int number = num;
            @Override
            public int next() {
                return number;
            }
        };
    }
}