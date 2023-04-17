package lab3.lab3_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }
    int next();
    static IntSequence of(int... integ) {

        return new IntSequence() {
            int count= 0;
            final int size= integ.length;
            private int number;
            @Override
            public boolean hasNext(){
                return count < size;
            }
            @Override
            public int next() {
                number = integ[count];
                count++;
                return number;
            }
        };

    }
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