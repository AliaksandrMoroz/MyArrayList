public class Main {
    public static void main(String[] args) {
//        MyList<String> myList = new MyArrayList<>();
//        myList.add("Alex");
//        myList.add("Vasya");
//        myList.add("Yarik");
//        myList.add("Vitya");
//        System.out.println(myList);

        MyArrayList<Person> personMyArrayList = new MyArrayList<>();

//        personMyArrayList.add( new Person("Ann"));
//        personMyArrayList.add( new Person("Bob"));
//        personMyArrayList.add( new Person("Vyasya"));
//        personMyArrayList.add( new Person("Steeve"));
//        personMyArrayList.add( new Person("Jordj"));
//
//        System.out.println(personMyArrayList);
//
//        personMyArrayList.sortPerson();
//        System.out.println(personMyArrayList);


        MyArrayList<Keeper> keeperMyArrayList = new MyArrayList<>();

        keeperMyArrayList.add( new Keeper(1, "Anna"));
        keeperMyArrayList.add( new Keeper(2, "Doba"));
        keeperMyArrayList.add( new Keeper(3, "Sina"));
        keeperMyArrayList.add( new Keeper(4, "Wasua"));
        keeperMyArrayList.add( new Keeper(5, "Masua"));
        keeperMyArrayList.add( new Keeper(6, "Aasua"));

        System.out.println(keeperMyArrayList);
        keeperMyArrayList.sortPersonByName();
        System.out.println(keeperMyArrayList);





//        MyArrayList<Integer> myList = new MyArrayList<>();
//
//        myList.add(1);
//        myList.add(8);
//        myList.add(15);
//        myList.add(20);
//        myList.add(4);
//
//        System.out.println(myList);
//
//        MyArrayList.BubbleSort bubbleSort = new MyArrayList.BubbleSort();
//        bubbleSort.bubbleSortMethod(myList);
//        System.out.println(myList);


    }
}
