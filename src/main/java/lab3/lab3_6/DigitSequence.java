package lab3.lab3_6;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public class DigitSequence implements Iterator<Integer> {

    private int number;
    int count = 0;
    int size = 10;

    DigitSequence(int number) {
        this.number = number;
    }

    @Override
    public boolean hasNext() {
        return size != count++;
    }

    @Override
    public Integer next() {
        return number;
    }

    @Override
    public void remove() {
    }
}
