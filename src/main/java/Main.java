import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Integer> integerList = new LinkedList<>();
//        integerList.add(1);
//        integerList.add(5);
//        integerList.add(12);
//        integerList.add(8);
//
//        integerList.get(0);
//
//        MyList<String> myList = new MyArrayList<>();
//        myList.add("Alex");
//        myList.add("Vasya");
//        myList.add("Yarik");
//        myList.add("Vitya");
//        System.out.println(myList);
//        myList.sortByToString();
//        System.out.println(myList);
//
//        MyList<Character> characterMyList = new MyArrayList<>();
//        characterMyList.add('a');
//        characterMyList.add('w');
//        characterMyList.add('c');
//        characterMyList.add('m');
//        characterMyList.add('a');
//        characterMyList.add('r');
//        System.out.println(characterMyList);
//        characterMyList.sortByToString();
//        System.out.println(characterMyList);
//
//        MyArrayList<Person> personMyArrayList = new MyArrayList<>();
//
//        personMyArrayList.add(new Person("Ann"));
//        personMyArrayList.add(new Person("Bob"));
//        personMyArrayList.add(new Person("Vasya"));
//        personMyArrayList.add(new Person("Steeve"));
//        personMyArrayList.add(new Person("Jordj"));
//
//        System.out.println(personMyArrayList);
//
//        personMyArrayList.sortByToString();
//        System.out.println(personMyArrayList);
//
//        MyList<Integer> integerMyArrayList = new MyArrayList<>();
//
//        integerMyArrayList.add(1);
//        integerMyArrayList.add(8);
//        integerMyArrayList.add(15);
//        integerMyArrayList.add(20);
//        integerMyArrayList.add(4);
//
//        System.out.println(integerMyArrayList);
//        integerMyArrayList.bubbleSortMethod(integerMyArrayList);
//        System.out.println(integerMyArrayList);

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(0);
        list.add(2);
        list.add(1);
        System.out.println(list.size());
        System.out.println(list.getArrayValueIndex());

        list.set(1, 5);
        list.print();

        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(42);
        list2.add(20);

        list2.set(0,50);

    }
}
