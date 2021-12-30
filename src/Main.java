import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        MyList<String> myList = new MyArrayList<>();
//        myList.add("Alex");
//        myList.add("Vasya");
//        myList.add("Yarik");
//        myList.add("Vitya");
//        System.out.println(myList);
//
//
//
//        System.out.println(myList);
//        System.out.println(myList.get(1));
//        System.out.println(myList.add(0,"Adil"));
//        System.out.println(myList);
//        System.out.println(myList.set(3,"Svetlana"));
//        System.out.println(myList);
//        System.out.println(myList.contains("Alex"));
//        System.out.println(myList.isEmpty());
//        myList.clear();
//        System.out.println(myList);

        MyArrayList<Integer> myList = new MyArrayList<>();

        myList.add(1);
        myList.add(8);
        myList.add(15);
        myList.add(20);
        myList.add(4);

        System.out.println(myList);

        MyArrayList.BubbleSort bubbleSort = new MyArrayList.BubbleSort();
        bubbleSort.BubbleSortMethod(myList);
        System.out.println(myList);

        /* От Вити, кароч, пришлось делать костыль, т.к. чтоб создать метод sort(), должны быть статическими методы size(), get(), set().
         * Поэтому, я пошел с помощью внутренних классов, но вот проблема небольшая осталась.
         * Суть: в BubbleSortMethod() в качестве параметра мы передаем созданный нами объект класса MyArrayList.
         * И через объект вызываем все методы, что нам нужны, чтоб не делать их статическими.
         * Чтоб все было по красоте, нам нужно сделать метод sort(), где вызовем метод BubbleSortMethod() из класса BubbleSort
         * У меня проблема с тем, какой параметр туда передать.
         */

    }
}
