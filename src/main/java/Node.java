public class Node<E> {
    public int data;
    public Node<E> next;
    public Node<E> prev;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}


