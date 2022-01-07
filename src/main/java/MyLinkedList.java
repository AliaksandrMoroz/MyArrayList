import java.util.Arrays;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;

    private boolean isEmpty() {
        return head == null;
    }

    public void addFirst(E value) {
        Node temp = new Node((Integer) value);

        if (isEmpty())
            tail = temp;
        else
            head.prev = temp;

        temp.next = head;
        head = temp;
    }

    public void addLast(E value) {
        Node temp = new Node((Integer) value);
        if (isEmpty())
            head = temp;
        else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;
    }

    public void addByIndex(E value, int index) {
        Node cur = head;
        int c = 0;

        while (cur != null && c != index) {
            cur = cur.next;
            c++;
        }

        Node temp = new Node((Integer) value);

        cur.prev.next = temp;
        temp.prev = cur.prev;
        cur.prev = temp;
        temp.next = cur;
    }

    public Node getByIndex(int index) {
        Node cur = head;
        int c = 0;

        while (cur != null && c != index) {
            cur = cur.next;
            c++;
        }
        return cur;
    }

    public void removeFirst() {
        Node temp = head;

        if (head.next == null) {
            tail = null;
        } else
            head.next.prev = null;
        head = head.next;
    }

    public void removeLast() {
        if (head.next == null)
            head = null;
        else
            tail.prev.next = null;

        tail = tail.prev;
    }

    public void removeAt(int key) {
        Node cur = head;

        while (cur.data != key) {
            cur = cur.next;

            if (cur == null)
                return;
        }

        if (cur == head)
            removeFirst();
        else
            cur.prev.next = cur.next;

        if (cur == tail)
            removeLast();
        else
            cur.next.prev = cur.prev;
    }

    public int size() {
        int length = 0;
        Node cur = head;


        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }


    public void bubbleSortInteger(MyLinkedList<Integer> integerMyLinkedList) {
        for (int i = 1; i < integerMyLinkedList.size(); i++) {
            for (int j = 0; j < integerMyLinkedList.size() - 1; j++) {
                if (integerMyLinkedList.getByIndex(j).getData() > integerMyLinkedList.getByIndex(j + 1).getData()) {
                    int temp = integerMyLinkedList.getByIndex(j).getData();
                    integerMyLinkedList.addByIndex(integerMyLinkedList.getByIndex(j + 1).getData(), j);
                    integerMyLinkedList.addByIndex(temp,j+1);
                }
            }
        }
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


