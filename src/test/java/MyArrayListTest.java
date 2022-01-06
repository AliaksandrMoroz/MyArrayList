import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.portable.ApplicationException;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private MyArrayList<Integer> beforeMyArrayList;
    @BeforeEach
    public void createNewMyArrayList() {
        beforeMyArrayList = new MyArrayList<>(6);
        beforeMyArrayList.add(53);
        beforeMyArrayList.add(4);
        beforeMyArrayList.add(32);
        beforeMyArrayList.add(2);
        beforeMyArrayList.add(1);
        beforeMyArrayList.add(56);
    }

    @Test
    void testEmptyConstructorShouldInstallDefaultCapacity() {
        MyArrayList testList = new MyArrayList();
        assertEquals(10, testList.getCapacity());
    }


    @Test
    void testConstructorShouldInstallFiveCapacity() {
        MyArrayList testList = new MyArrayList(5);
        assertEquals(5, testList.getCapacity());
    }

    @Test
    void testAddShouldAddedElement() {
        beforeMyArrayList.add(15);
        assertEquals(15,beforeMyArrayList.get(beforeMyArrayList.size()-1));
    }

    @Test
    void testIncreaseCapacityShouldTripleIt(){
        beforeMyArrayList.add(5);
        assertEquals(18,beforeMyArrayList.getCapacity());
    }

    @Test
    void testRemoveShouldReduceMyArrayIndex(){
        beforeMyArrayList.remove(1);
        assertEquals(5,beforeMyArrayList.size());
    }

    @Test
    void testSizeShouldReturnCountElementForMyArrayList() {
        assertEquals(beforeMyArrayList.getArrayValueIndex(),beforeMyArrayList.size());
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