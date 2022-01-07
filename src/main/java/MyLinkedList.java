import java.util.Arrays;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int arrayValueIndex = 0;
    private E[] arrayValue;


    private boolean isEmpty() {                             // Метод isEmpty
        return head == null;                                // проверяем не равен ли head null-у
    }

//    public void addFirst(E value) {                         // Метод добавления в начало списка MuLinkedList. Метод принимает объект класса Е(Object). Ничего не возвращает.
//        Node temp = new Node((Integer) value);              // Создаём новый узел
//
//        if (isEmpty())                                      // Проверяем на наличие содержимого
//            tail = temp;                                    // в случае true присваиваем tail-у временную переменную temp
//        else                                                // иначе
//            head.prev = temp;                               // ссылке на предыдущий элемент head.prev присваиваем временную переменную temp
//
//        temp.next = head;                                   // ссылке temp.next присавиваем переменную head
//        head = temp;                                        // переменной head присваеиваем значение temp
//    }

    public void add(E value) {                          // Метод добавления в конец списка MuLinkedList. Метод принимает объект класса Е(Object). Ничего не возвращает.
        Node temp = new Node((Integer) value);              // Создаём новый узел
        if (isEmpty())                                      // Проверяем на наличие содержимого
            head = temp;                                    // в случае true присваиваем head-у временную переменную temp
        else                                                // иначе
            tail.next = temp;                               // ссылке на следующий элемент tail.next присваиваем временную переменную temp

        temp.prev = tail;                                   // ссылке temp.prev присавиваем переменную tail
        tail = temp;                                        // переменной tail присваеиваем значение temp
    }

//    public void addByIndex(E value, int index) {            // Метод добавления по индексу addByIndex. Метод принимает объект класса Е(Object) и целочисленное значение индекса. Ничего не возвращает.
//        Node cur = head;                                    // Текущий элемент Node
//        int c = 0;                                          // объявляем временную целочисленную переменную для учёта индекса
//
//        while (cur != null && c != index) {                 // Пока текущий элемент не равен null-у и с не равно индексу
//            cur = cur.next;                                 // Текущему значени. присваиваем следующее значение
//            c++;                                            // Индекс также добавляем
//        }
//
//        Node temp = new Node((Integer) value);              // Создаём новый узел
//
//        cur.prev.next = temp;                               // текущий элемент и ссылка на предыдущий и на следующий элементы приравниваем к временному элементу temp
//        temp.prev = cur.prev;                               // ссылке временного элемента на предыдущий элемент присваиваем текущий элемент на предыдущий элемент
//        cur.prev = temp;                                    // ссылке текущему элементу на предыдущий элемент присваиваем временную переменную temp
//        temp.next = cur;                                    // ссылке временного элемента на следующий элемент присваиваем текущему элементу
//    }

    public Node get(int index) {
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

    public E set(int index, E value) {
        if (index < 0 || index >= size()) {        // Если индекс меньше 0 или больше значения переменной arrayValueIndex
            throw new IndexOutOfBoundsException();          // то выбрасываем ошибку IndexOutOfBoundsException()
        }
        if (value == null) {                                    // Если значение value равно ничего
            throw new NullPointerException();               // то выбрасываем ошибку NullPointerException()
        }
        E oldValue = arrayValue[index];
        arrayValue[index] = value;
        return oldValue;

    }


    public void bubbleSortInteger(MyLinkedList<Integer> integerMyLinkedList) {
        for (int i = 1; i < integerMyLinkedList.size(); i++) {
            for (int j = 0; j < integerMyLinkedList.size() - 1; j++) {
                if (integerMyLinkedList.get(j).getData() > integerMyLinkedList.get(j + 1).getData()) {
                    int temp = integerMyLinkedList.get(j).getData();
                    integerMyLinkedList.set(j, integerMyLinkedList.get(j + 1).getData());
                    integerMyLinkedList.set(j+1, temp);
                }
            }
        }
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println("{data = " + temp.data + ", next = " + temp.next + ", prev = " + temp.prev + "}");
            temp = temp.next;
        }
    }

}


