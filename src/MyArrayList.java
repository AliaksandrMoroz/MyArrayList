
import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private E[] arrayValue;
    private int arrayValueIndex = 0;
    private int capacity = 0;
    private double filling = 0.7;

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        arrayValue = (E[]) new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        arrayValue = (E[]) new Object[capacity];
    }

    public MyArrayList(int capacity, double volume) {
        this.capacity = capacity;
        this.filling = volume;
        arrayValue = (E[]) new Object[capacity];
    }

    public double getFilling() {
        return filling;
    }

    public void setFilling(double filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        String result = "[" + arrayValue[0];

        for (int i = 1; i < arrayValueIndex; i++) {
            result += ", " + arrayValue[i];
        }
        result += "]";
        return result;


    }

    @Override
    public boolean add(E value) {
        if (arrayValueIndex < capacity * filling) {
            arrayValue[arrayValueIndex] = value;
            arrayValueIndex++;
            return true;
        } else {
            increaseCapacity();
            arrayValue[arrayValueIndex] = value;
            return true;
        }
    }

    private void increaseCapacity() {
        capacity = (int) capacity * 3 / 2;
        arrayValue = Arrays.copyOf(arrayValue, capacity);
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= arrayValueIndex) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index + 1; i < arrayValueIndex; i++) {
            arrayValue[i - 1] = arrayValue[i];
        }
        arrayValueIndex--;
        return true;
    }

    @Override
    public int size() {
        return this.arrayValueIndex;
    }

    @Override
    public boolean remove(E value) {
        int index = -1;
        for (int i = 0; i < arrayValueIndex; i++) {
            if (value.equals(arrayValue[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= arrayValueIndex) {
            throw new IndexOutOfBoundsException();
        }
        return arrayValue[index];
    }

    @Override
    public int indexOf(E value) {
        if (value != null) {
            for (int i = 0; i < arrayValueIndex; i++) {
                if (arrayValue[i].equals(value)) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override
    public boolean add(int index, E value) {
        if (index < 0 || index > arrayValueIndex) {
            throw new IndexOutOfBoundsException();
        }
        if (arrayValueIndex >= capacity * filling) {
            increaseCapacity();
        }
        for (int i = arrayValueIndex; i > index; i--) {
            arrayValue[i] = arrayValue[i - 1];
        }
        arrayValue[index] = value;
        arrayValueIndex++;
        return true;
    }

    @Override
    public E set(int index, E value) {
        if (index < 0 || index >= arrayValueIndex) {
            throw new IndexOutOfBoundsException();
        }
        E oldValue = arrayValue[index];
        arrayValue[index] = value;
        return oldValue;
    }

    @Override
    public boolean contains(E value) {
        if (value != null) {
            for (int i = 0; i < arrayValueIndex; i++) {
                if (arrayValue[i].equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return arrayValueIndex == 0;
    }

    @Override
    public void clear() {
        arrayValueIndex = 0;
        arrayValue=(E[]) new Object[capacity];
    }
}
