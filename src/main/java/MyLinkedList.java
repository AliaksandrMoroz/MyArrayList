public class MyLinkedList<E extends Comparable> {
    private Node<E> head;
    private Node<E> tail;
    private int arrayValueIndex;

    boolean isEmpty() {                             // Метод isEmpty
        return head == null;                                // проверяем не равен ли head null-у
    }

    boolean hasOnlyOneItem() {
        return head.next == null;
    }


    public void add(E value) {                          // Метод добавления в конец списка MuLinkedList. Метод принимает объект класса Е(Object). Ничего не возвращает.
        Node<E> temp = new Node<>(value);              // Создаём новый узел
        if (isEmpty())                                      // Проверяем на наличие содержимого
            head = temp;                                    // в случае true присваиваем head-у временную переменную temp
        else                                                // иначе
            tail.next = temp;                               // ссылке на следующий элемент tail.next присваиваем временную переменную temp
        temp.prev = tail;                                   // ссылке temp.prev присавиваем переменную tail
        tail = temp;                                        // переменной tail присваеиваем значение temp
        arrayValueIndex++;
    }


    public Node<E> get(int index) {
        Node<E> cur = head;
        int c = 0;

        while (cur != null && c != index) {
            cur = cur.next;
            c++;
        }
        return cur;
    }

    public boolean removeFirst() {
//        Node<E> temp = head;
        if (head.next == null) {
            tail = null;
        } else
            head.next.prev = null;
        head = head.next;
        return true;
    }

    public boolean removeLast() {
        if (head.next == null)
            head = null;
        else
            tail.prev.next = null;
        tail = tail.prev;
        return true;
    }

    public boolean removeAt(E key) {
        Node<E> cur = head;
        while (!cur.data.equals(key)) {
            cur = cur.next;
            if (cur == null)
                return false;
        }

        if (cur == head) {
            removeFirst();
        } else {
            cur.prev.next = cur.next;
        }

        if (cur == tail) {
            removeLast();
        } else {
            cur.next.prev = cur.prev;
        }
        return true;
    }

    public int size() {

        Node<E> cur = head;
        while (cur != null) {
            cur = cur.next;
        }
        return arrayValueIndex;
    }


    void sort() {
        if (hasOnlyOneItem()) {
            return;
        }
        Node<E> tmp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            tmp = head;
            while (tmp.next != null) {
                if (tmp.data.compareTo(tmp.next.data) > 0) {
                    tmp.swap(tmp.next);
                    isSorted = false;
                } else if (tmp.data.compareTo(tmp.next.data) == 0 && tmp.data.compareTo(tmp.next.data) > 0) {
                    tmp.swap(tmp.next);
                    isSorted = false;
                } else {
                    tmp = tmp.next;
                }
            }
        }
    }

    @Override
    public String toString() {
        Node<E> temp = head;
        StringBuilder result = new StringBuilder("[");
        while (temp != null) {
            result.append(temp.data).append(", ");
            temp = temp.next;
        }
        result = new StringBuilder(result.substring(0, result.length() - 2));
        result.append("]");
        return result.toString();
    }

    public int getArrayValueIndex() {
        return arrayValueIndex;
    }
}


