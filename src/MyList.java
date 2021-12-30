public interface MyList<E> {
    boolean add(E value);
    boolean remove(int index);
    int size();
    boolean remove(E value);
    E get(int index);
    int indexOf(E value);
    boolean add(int index, E value);
    E set(int index, E value);
    boolean contains(E value);
    boolean isEmpty();
    void clear();
    void sort();

}
