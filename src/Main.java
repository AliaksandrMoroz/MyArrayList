public class Main {
    public static void main(String[] args) {
//        MyList<String> myList = new MyArrayList<>();
//        myList.add("Alex");
//        myList.add("Vasya");
//        myList.add("Yarik");
//        myList.add("Vitya");
//        System.out.println(myList);
//        myList.sortPersonByName();
//        System.out.println(myList);

//        MyList<Character> characterMyList = new MyArrayList<>();
//        characterMyList.add('a');
//        characterMyList.add('w');
//        characterMyList.add('c');
//        characterMyList.add('m');
//        characterMyList.add('a');
//        characterMyList.add('r');
//        System.out.println(characterMyList);
//        characterMyList.sortPersonByName();
//        System.out.println(characterMyList);

//        MyArrayList<Person> personMyArrayList = new MyArrayList<>();
//
//        personMyArrayList.add( new Person("Ann"));
//        personMyArrayList.add( new Person("Bob"));
//        personMyArrayList.add( new Person("Vyasya"));
//        personMyArrayList.add( new Person("Steeve"));
//        personMyArrayList.add( new Person("Jordj"));
//
//        System.out.println(personMyArrayList);
//
//        personMyArrayList.sortPersonByName();
//        System.out.println(personMyArrayList);


//        MyList<Keeper> keeperMyArrayList = new MyArrayList<>();
//
//        keeperMyArrayList.add( new Keeper(1, "Anna"));
//        keeperMyArrayList.add( new Keeper(2, "Doba"));
//        keeperMyArrayList.add( new Keeper(3, "Sina"));
//        keeperMyArrayList.add( new Keeper(4, "Wasua"));
//        keeperMyArrayList.add( new Keeper(5, "Masua"));
//        keeperMyArrayList.add( new Keeper(6, "Aasua"));
//
//        System.out.println(keeperMyArrayList);
//        keeperMyArrayList.sortPersonByName();
//        System.out.println(keeperMyArrayList);





        MyList<Integer> integerMyArrayList = new MyArrayList<>();

        integerMyArrayList.add(1);
        integerMyArrayList.add(8);
        integerMyArrayList.add(15);
        integerMyArrayList.add(20);
        integerMyArrayList.add(4);

        System.out.println(integerMyArrayList);
        integerMyArrayList.sortByToString();
        System.out.println(integerMyArrayList);

//        MyArrayList.BubbleSort bubbleSort = new MyArrayList.BubbleSort();
//        bubbleSort.bubbleSortMethod(integerMyArrayList);
//        System.out.println(integerMyArrayList);


    }
}
