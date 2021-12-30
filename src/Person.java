public class Person {
    private  int id;
    private String name;

    public static int coint=1;

    public Person(String name) {
        this.id=coint++;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'+"\n";
    }

    public int getId() {
        return id;
    }

    public int compareTo(Person o) {
//        return this.id-o.id;
//        return this.name.length()-o.name.length();
        return this.name.compareToIgnoreCase(o.name);

    }
}
