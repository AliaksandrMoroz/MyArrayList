public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyArrayList<>();
        myList.add("Alex");
        myList.add("Vasya");
        myList.add("Yarik");
        myList.add("Vitya");
        System.out.println(myList);


        System.out.println(myList);
        System.out.println(myList.get(1));
        System.out.println(myList.add(0,"Adil"));
        System.out.println(myList);
        System.out.println(myList.set(3,"Svetlana"));
        System.out.println(myList);

    }
}
