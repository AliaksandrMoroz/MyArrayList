public interface MyList<E> {
    boolean add(E value);                  // Прописываем структуру метода, который возвращает boolean переменную при добавление элемента в список. Метод принимает объект класса Е(Object). При успешном добавлении возвращает true, если элемент добавить не удалось -- возвращает false.

    boolean remove(int index);             // Прописываем структуру метода, который возвращает boolean переменную при удалении элемента из списка. Метод принимает целочисленный тип int переменной index. При успешном удалении возвращает true, если элемент удалить не удалось -- возвращает false.

    int size();                         // Прописываем структуру метода, который возвращает int переменную размера списка.

    boolean remove(E value);            // Прописываем структуру метода, который возвращает boolean переменную при удалении элемента из списка. Метод принимает объект класса Е(Object). При успешном удалении возвращает true, если элемент удалить не удалось -- возвращает false.

    E get(int index);                   // Прописываем структуру метода, который возвращает объект класса Е по входному индексу(index).

    int indexOf(E value);               // Прописываем структуру метода, который возвращает int переменную индекса значения. Метод принимает объект класса Е(Object).

    boolean add(int index, E value);    // Прописываем структуру метода, который возвращает boolean переменную при добавление элемента в список. Метод принимает целочисленный тип int переменной index и объект класса Е(Object). При успешном добавлении возвращает true, если элемент добавить не удалось -- возвращает false.

    E set(int index, E value);          // Прописываем структуру метода, который возвращает объект класса Е по входному целочисленному индексу(index) и объекту класса Е(Object).

    boolean contains(E value);          // Прописываем структуру метода, который возвращает boolean переменную при сравнении элемента в списке. Метод принимает объект класса Е(Object). При успешном сравнении возвращает true, если элемент найти не удалось -- возвращает false.

    boolean isEmpty();                  // Прописываем структуру метода, который возвращает boolean переменную при проверке элемента по индексу в списке. При успешном проверке возвращает true, если элемент индекса найти не удалось -- возвращает false

    void clear();                       // Прописываем структуру метода, который ничего не возвращает. Метод очищает список.

    void sortByToString();              // Прописываем структуру метода, который ничего не возвращает. Метод сортирует список

    void bubbleSortMethod(MyList<Integer> myArrayList);

}