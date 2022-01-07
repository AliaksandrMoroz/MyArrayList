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

        MyLinkedList<String> list = new MyLinkedList<>();
//        list.add(0);
//        list.add(2);
//        list.add(7);
//        list.add(8);
//        list.add(122);
//        list.add(11);
//        list.add(-15);
//        list.add(-23);
//        list.add(40);
        list.add("stri");
        list.add("rtri");
        list.add("htri");
        list.add("dstri");
        list.add("jtri");
        list.add("rttri");
        list.add("fdsgtri");
        list.add("atri");
        System.out.println(list.size());
        System.out.println(list.getArrayValueIndex());
        System.out.println(list);
        list.sort();
        System.out.println("___________");
        System.out.println(list);



    }
}
