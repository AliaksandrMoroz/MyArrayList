import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @BeforeEach
    public void createNewMyArrayList(){
        MyArrayList<Integer> beforeMyArrayList = new MyArrayList<>();
        beforeMyArrayList.add(53);
        beforeMyArrayList.add(4);
        beforeMyArrayList.add(32);
        beforeMyArrayList.add(2);
        beforeMyArrayList.add(1);
        beforeMyArrayList.add(56);
    }
    @Test
    void testEmptyConstructorShouldInstallDefaultCapacity(){
        MyArrayList testList = new MyArrayList();
        assertEquals(10,testList.getCapacity());
    }
    @Test
    void testConstructorShouldInstallFiveCapacity(){
        MyArrayList testList = new MyArrayList(5);
        assertEquals(5,testList.getCapacity());
    }

    @Test
    void add() {

    }

    @Test
    void remove() {
    }

    @Test
    void size() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void get() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void set() {
    }

    @Test
    void contains() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void clear() {
    }

    @Test
    void sortByToString() {
    }

    @Test
    void bubbleSortMethod() {
    }
}