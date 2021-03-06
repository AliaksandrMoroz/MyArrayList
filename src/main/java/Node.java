public class Node<E extends Comparable> {
    public E data;
    public Node<E> next;
    public Node<E> prev;

    public Node() {
    }

    public Node(E data) {
        this.data = data;
    }
    public Node(E info, Node<E> prev, Node<E> next) {
        this.data = info;
        this.prev = prev;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
    @Override
    public boolean equals(Object o) {
        Node<E> in = (Node<E>) o;
        return this.data.equals(in.data);
    }

    void swap(Node<E> b) {
        //swapping info
        E tmp = this.data;
        this.data = (E) b.data;
        b.data = tmp;
    }
}


