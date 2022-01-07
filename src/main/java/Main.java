public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyArrayList<>();
        myList.add("Alex");
        myList.add("Vasya");
        myList.add("Yarik");
        myList.add("Vitya");
        System.out.println(myList);
        myList.sortByToString();
        System.out.println(myList);

        MyList<Character> characterMyList = new MyArrayList<>();
        characterMyList.add('a');
        characterMyList.add('w');
        characterMyList.add('c');
        characterMyList.add('m');
        characterMyList.add('a');
        characterMyList.add('r');
        System.out.println(characterMyList);
        characterMyList.sortByToString();
        System.out.println(characterMyList);

        MyArrayList<Person> personMyArrayList = new MyArrayList<>();

        personMyArrayList.add(new Person("Ann"));
        personMyArrayList.add(new Person("Bob"));
        personMyArrayList.add(new Person("Vasya"));
        personMyArrayList.add(new Person("Steeve"));
        personMyArrayList.add(new Person("Jordj"));

        System.out.println(personMyArrayList);

        personMyArrayList.sortByToString();
        System.out.println(personMyArrayList);

        MyList<Integer> integerMyArrayList = new MyArrayList<>();

        integerMyArrayList.add(1);
        integerMyArrayList.add(8);
        integerMyArrayList.add(15);
        integerMyArrayList.add(20);
        integerMyArrayList.add(4);

        System.out.println(integerMyArrayList);
        integerMyArrayList.bubbleSortMethod(integerMyArrayList);
        System.out.println(integerMyArrayList);

        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList();
        integerMyLinkedList.addLast(1);
        integerMyLinkedList.addLast(2);
        integerMyLinkedList.addLast(5);
        integerMyLinkedList.addLast(8);

        integerMyLinkedList.print();
        System.out.println();
        integerMyLinkedList.bubbleSortInteger(integerMyLinkedList);
        integerMyLinkedList.print();

    }
}
