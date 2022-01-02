import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> integerMyArrayList = new MyArrayList<>();

        integerMyArrayList.add(12);
        integerMyArrayList.add(1);
        integerMyArrayList.add(50);
        integerMyArrayList.add(48);
        integerMyArrayList.add(42);

        System.out.println(integerMyArrayList);
        integerMyArrayList.sort();
        System.out.println(integerMyArrayList);
        System.out.println();


        MyList<Double> doubleMyArrayList = new MyArrayList<>();

        doubleMyArrayList.add(1.2);
        doubleMyArrayList.add(1.0);
        doubleMyArrayList.add(5.0);
        doubleMyArrayList.add(4.8);
        doubleMyArrayList.add(4.2);

        System.out.println(doubleMyArrayList);
        doubleMyArrayList.sort();
        System.out.println(doubleMyArrayList);
        System.out.println();

        MyList<String> stringMyList = new MyArrayList<>();

        stringMyList.add("Steve");
        stringMyList.add("Vitya");
        stringMyList.add("Ann");
        stringMyList.add("Bob");

        System.out.println(stringMyList);
        stringMyList.sort();
        System.out.println(stringMyList);
        System.out.println();

        MyList<Person> personMyList = new MyArrayList<>();

        personMyList.add(new Person(1, "Steve"));
        personMyList.add(new Person(2, "Vitya"));
        personMyList.add(new Person(3, "Alex"));
        personMyList.add(new Person(4, "Vasya"));
        personMyList.add(new Person(5, "Nicolai"));

        System.out.println(personMyList);
        personMyList.sort();
        System.out.println(personMyList);
        System.out.println();

        TreeSet<Person> personList = new TreeSet<>();
        personList.add(new Person(9, "Steve"));
        personList.add(new Person(12, "Vteve"));
        personList.add(new Person(5, "Teve"));
        personList.add(new Person(8, "Dteve"));

        System.out.println(personList);


    }
}
