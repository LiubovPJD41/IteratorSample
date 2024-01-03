package Polyaeva;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(Random random, int min, int max) {
        this.random = random;
        this.min = min;
        this.max = max;                  //...
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iterator = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt((max - min) + 1) + min;
            }
        };
        return iterator;
    }
}
