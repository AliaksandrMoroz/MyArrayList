import java.util.Arrays;


public class MyArrayList<E> implements MyList<E> {      // Создаём публичный класс MyArrayList<E>, который реализует интерфейс MyList<E>

    private static final int DEFAULT_CAPACITY = 10;     // Создаём начальный размер массива. Объявляем приватную статическую конечную переменную целочисленного типа DEFAULT_CAPACITY с константным значением 10
    private E[] arrayValue;                             // Объявляем приватный внутренний массив класса Object (E)
    private int arrayValueIndex = 0;                    // Создаём переменную, которая в себе хранит индекс arrayValue[]. Объявляем приватную переменную целочисленного типа arrayValueIndex и значением 0
    private int capacity = 0;                           // Создаём переменную, которая хранит в себе длину массива. Объявляем приватную переменную целочисленного типа capacity и значением 0

    public MyArrayList() {                              // Создаём конструктор,  в котором инициализируем переменную DEFAULT_CAPACITY
        this.capacity = DEFAULT_CAPACITY;
        arrayValue = (E[]) new Object[capacity];        // Создаём новый массив, который относится к классу Object
    }

    public MyArrayList(int capacity) {// Создаём конструктор,  в котором инициализируем переменную capacity, в параметры которого передаём значение capacity
        if (capacity <= 0) {
            throw new IndexOutOfBoundsException();
        }
        this.capacity = capacity;
        arrayValue = (E[]) new Object[capacity];        // Создаём новый массив, который относится к классу Object
    }


    @Override
    public String toString() {                          // Переопределяем метод toString
        String result = "[" + arrayValue[0];

        for (int i = 1; i < arrayValueIndex; i++) {
            result += ", " + arrayValue[i];
        }
        result += "]";
        return result;


    }


    @Override
    public boolean add(E value) {                           // Переопределяем метод add. Метод принимает объект класса Е(Object)
        if (value == null) {                                // Проверяем переменную value на содержание
            throw new NullPointerException();               // Если в ней ничего, то выбрасываем ошибку NullPointerException()
        } else {                                            // иначе

            if (arrayValueIndex < capacity) {               // Если значение индекса arrayValueIndex меньше длины массива
                arrayValue[arrayValueIndex] = value;        // то в значение переменной arrayValue с индексом arrayValueIndex записываем значение value
                arrayValueIndex++;                          // добавляем индекс записываем в счётчик
                return true;                                // При успешном добавлении возвращаем true
            } else {                                        // иначе
                increaseCapacity();                         // Вызываем метод по увеличению длины массива
                arrayValue[arrayValueIndex] = value;        // и в значение переменной arrayValue с индексом arrayValueIndex записываем значение value
                arrayValueIndex++;                          // добавляем индекс записываем в счётчик
                return true;                                // При успешном добавлении возвращаем true
            }
        }
    }


    private void increaseCapacity() {                       // Создаём метод по увеличению массива
        this.capacity *= 3;                                      // Увеличиваем длину массива в 3 раза
        this.arrayValue = Arrays.copyOf(this.arrayValue, this.capacity);   // В переменную arrayValue копируем новый arrayValue и объём массива
    }


    @Override
    public boolean remove(int index) {                      // Переопределяем метод remove. Метод принимает индекс
        if (index < 0 || index >= arrayValueIndex) {        // Если индекс меньше 0 и больше либо равен переменной arrayValueIndex
            throw new IndexOutOfBoundsException();          // то выбрасываем ошибку IndexOutOfBoundsException()
        }
        for (int i = index + 1; i < arrayValueIndex; i++) { // перебираем индексы
            arrayValue[i - 1] = arrayValue[i];              // присваиваем новое значание переменной arrayValue
        }
        arrayValueIndex--;                                  // удаляем индекс из счётчика
        return true;                                        // При успешном удалении возвращаем true
    }


    @Override
    public int size() {                                     // Переопределяем метод add
        return this.arrayValueIndex;                        // Возвращаем размер переменной arrayValueIndex
    }


    @Override
    public boolean remove(E value) {                        // Переопределяем метод remove. Метод принимает объект класса Е(Object)
        if (value == null) {                                    // Проверяем переменную value на содержание
            throw new NullPointerException();               // Если в ней ничего, то выбрасываем ошибку NullPointerException()
        }                                                   // иначе
        int index = -1;                                     // присваиваем индексу -1
        for (int i = 0; i < arrayValueIndex; i++) {         // перебираем индексы
            if (value.equals(arrayValue[i])) {              // если значение объект класса Е(Object) совпадает с arrayValue[i]
                index = i;                                  // то присваиваем индексу -- i
                break;
            }
        }
        if (index != -1) {                                  // если индекс не равен -1
            remove(index);                                  // то удаляем индекс
            return true;                                    // При успешном удалении возвращаем true
        }
        return false;                                       // иначе возвращаем false
    }


    @Override
    public E get(int index) {                               // Переопределяем метод E get. Метод принимает index
        if (index < 0 || index >= arrayValueIndex) {        // Если индекс меньше 0 или индекс больше значения переменной arrayValueIndex
            throw new IndexOutOfBoundsException();          // то выбрасываем ошибку IndexOutOfBoundsException()
        }
        return arrayValue[index];                           // Возвращаем значение переменной arrayValue по индексу
    }


    @Override
    public int indexOf(E value) {                           // Переопределяем метод indexOf. Метод принимает объект класса Е(Object)
        if (value != null) {                                // Если значение value не равно ничего
            for (int i = 0; i < arrayValueIndex; i++) {     // то перебираем значения индексов от 0 до значения переменной arrayValueIndex
                if (arrayValue[i].equals(value)) {          // Если значение переменной i-того arrayValue совпадает со значением value
                    return i;                               // то возвращаем i-тый индекс
                }
            }
            return -1;                                      // иначе возвращаем -1
        }
        return -1;                                          // иначе возвращаем -1
    }


    @Override
    public boolean add(int index, E value) {                // Переопределяем метод add. Метод принимает index и объект класса Е(Object)
        if (index < 0 || index > arrayValueIndex) {         // Если индекс меньше 0 или больше значения переменной индекса arrayValueIndex
            throw new IndexOutOfBoundsException();          // то выбрасываем ошибку IndexOutOfBoundsException()
        }
        if (value == null) {                                    // Если в значении переменной  value ничего, то
            throw new NullPointerException();               // выбрасываем ошибку NullPointerException()
        }
        if (arrayValueIndex >= capacity) {                  // Если значение переменной индекса arrayValueIndex больше либо равно длине массива capacity
            increaseCapacity();                             // то запускаем метод увеличения длины массива increaseCapacity()
        }
        for (int i = arrayValueIndex; i > index; i--) {     // Перебираем значения переменной индексов arrayValueIndex
            arrayValue[i] = arrayValue[i - 1];              // Для переменной значения arrayValue присваиваем новое значение
        }
        arrayValue[index] = value;                          // В переменную arrayValue по индексу [index] записываем значение value
        arrayValueIndex++;                                  // В переменную индекса arrayValueIndex добавляем значение индекса
        return true;                                        // При успешном добавлении возвращаем true
    }

    public E[] getArrayValue() {
        return arrayValue;
    }

    public int getArrayValueIndex() {
        return arrayValueIndex;
    }

    @Override
    public E set(int index, E value) {                      // Переопределяем метод E set. Метод принимает index и объект класса Е(Object)
        if (index < 0 || index >= arrayValueIndex) {        // Если индекс меньше 0 или больше значения переменной arrayValueIndex
            throw new IndexOutOfBoundsException();          // то выбрасываем ошибку IndexOutOfBoundsException()
        }
        if (value == null) {                                    // Если значение value равно ничего
            throw new NullPointerException();               // то выбрасываем ошибку NullPointerException()
        }
        E oldValue = arrayValue[index];                     // Иначе старому значению объекта E oldValue присваиваем значение arrayValue по индексу
        arrayValue[index] = value;                          // Значению arrayValue по индексу присваиваем новое значение value
        return oldValue;                                    // Возвращаем значение oldValue
    }


    @Override
    public boolean contains(E value) {                      // Переопределяем метод containes. Метод принимает объект класса Е(Object)
        if (value != null) {                                // Если в значении переменной  value ничего, то
            for (int i = 0; i < arrayValueIndex; i++) {     // перебираем индексы от 0 до значения arrayValueIndex
                if (arrayValue[i].equals(value)) {          // Если значение переменной arrayValue совпадает со значением value
                    return true;                            // то возвращаем true
                }
            }
        }
        return false;                                       // иначе возвращаем false
    }


    @Override
    public boolean isEmpty() {                              // Переопределяем метод isEmpty
        return arrayValueIndex == 0;                        // Возвращаем сравнение индекса arrayValueIndex с 0
    }

    @Override
    public void clear() {                                   // Переопределяем метод clear
        arrayValueIndex = 0;                                // Значению переменной индексов arrayValueIndex присваиваем 0
        arrayValue = (E[]) new Object[capacity];              // Значению перменной arrayValue создаём новый обект массива Е длинной capacity
    }


    public void sortByToString() {                              // Переопределяем метод sort для собственных классов и строковых значений

        for (int i = 1; i < arrayValueIndex; i++) {             // Сортируем пузырьком по значению ToString
            for (int k = 0; k < arrayValueIndex - 1; k++) {
                if (arrayValue[i].toString().compareToIgnoreCase(arrayValue[k].toString()) < 0) {
                    E temp = arrayValue[i];
                    arrayValue[i] = (arrayValue[k]);
                    arrayValue[k] = temp;
                }
            }
        }
    }

    @Override
    public void bubbleSortMethod(MyList<Integer> myArrayList) {// Метод сортировки пузырьком для Integer
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

    public int getCapacity() {
        return capacity;
    }
}


