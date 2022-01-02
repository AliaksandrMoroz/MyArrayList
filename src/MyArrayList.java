
import java.util.Arrays;


public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private E[] arrayValue;
    private int arrayValueIndex = 0;
    private int capacity = 0;

    public MyArrayList() {
        this.capacity = DEFAULT_CAPACITY;
        arrayValue = (E[]) new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        arrayValue = (E[]) new Object[capacity];
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
        if (value == null) {
            throw new NullPointerException();
        } else {

            if (arrayValueIndex < capacity) {
                arrayValue[arrayValueIndex] = value;
                arrayValueIndex++;
                return true;
            } else {
                increaseCapacity();
                arrayValue[arrayValueIndex] = value;
                return true;
            }
        }
    }

    private void increaseCapacity() {
        capacity *= 3;
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
        if (value == null) {
            throw new NullPointerException();
        }
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
        if (value == null) {
            throw new NullPointerException();
        }
        if (arrayValueIndex >= capacity) {
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
        if (value == null) {
            throw new NullPointerException();
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
        arrayValue = (E[]) new Object[capacity];
    }

    @Override
    public void sort() {
        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSortMethod();
    }

    public void sortByToString() {
        E[] personMyList = (E[]) new Object[this.arrayValueIndex];
        for (int i = 0; i < this.arrayValueIndex; i++) {
            personMyList[i] = (E) this.arrayValue[i];
        }

        for (int i = 1; i < personMyList.length; i++) {
            for (int k = 0; k < personMyList.length - 1; k++) {
                if (personMyList[i].toString().compareToIgnoreCase(personMyList[k].toString()) < 0) {
                    E temp = personMyList[i];
                    personMyList[i] = (personMyList[k]);
                    personMyList[k] = temp;
                }
            }
        }
        for (int i = 0; i < this.arrayValueIndex; i++) {
            arrayValue[i] = (E) personMyList[i];
        }
    }

//    public void sortPersonByName() {
//        E[] personMyList =(E[]) new Object[this.arrayValueIndex];
//        for (int i = 0; i < this.arrayValueIndex; i++) {
//            personMyList[i] = this.arrayValue[i];
//
//            System.out.println(personMyList.getClass().getName());
//        }
//
//        for (int i = 1; i < personMyList.length; i++) {
//            for (int k = 0; k < personMyList.length - 1; k++) {
//                if (personMyList[i].getClass().getName().compareToIgnoreCase(personMyList[k].getClass().getName()) < 0) {
//
//                    E temp = personMyList[i];
//                    personMyList[i] = (personMyList[k]);
//                    personMyList[k] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < this.arrayValueIndex; i++) {
//            arrayValue[i] = (E) personMyList[i];
//        }
//    }

    public static class BubbleSort {
        public void bubbleSortMethod(MyArrayList<Integer> myArrayList) {
            for (int i = 1; i < myArrayList.size(); i++) {
                for (int j = 0; j < myArrayList.size() - 1; j++) {
                    if (myArrayList.get(j) > myArrayList.get(j + 1)) {
                        int temp = (int) myArrayList.get(j);
                        myArrayList.set(j, myArrayList.get(j + 1));
                        myArrayList.set(j + 1, temp);
                    }
                }
            }
        }
    }

}
