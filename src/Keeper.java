public class Keeper {
    private int id;
    private String name;

    public Keeper(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
