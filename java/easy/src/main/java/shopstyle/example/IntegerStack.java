package shopstyle.example;

import java.util.Arrays;
import java.util.Optional;

/**
 * An {@link Integer} implementation of {@link Stack}.
 *
 * <p>Instances of this class are not thread-safe.</p>
 */
public class IntegerStack implements Stack<Integer> {

    private static int DEFAULT_CAPACITY = 10;

    private int capacity;
    private int size;
    private Integer[] array;

    public IntegerStack() {
        this(DEFAULT_CAPACITY);
    }

    public IntegerStack(int capacity) {
        this.capacity = capacity;
        this.array = new Integer[this.capacity];
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Optional<Integer> peek() {
        if (isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(array[this.size - 1]);
        }
    }

    @Override
    public Optional<Integer> pop() {
        if (isEmpty()) {
            return Optional.empty();
        } else {
            Optional<Integer> result = Optional.of(array[this.size - 1]);
            array[this.size - 1] = 0;
            this.size--;
            return result;
        }
    }

    @Override
    public void push(Integer val) {
        if (this.size == this.capacity) {
            this.capacity *= 2;
            Integer[] newArray = Arrays.copyOf(this.array, this.capacity);
            this.array = newArray;
        }
        this.array[size] = val;
        this.size++;
    }
}
