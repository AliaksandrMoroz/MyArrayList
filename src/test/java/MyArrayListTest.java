import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.portable.ApplicationException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    void testRemoveShouldReturnFalseForValueNotFound(){
        MyArrayList<String> testList = new MyArrayList(5);
        testList.add("test");
        testList.add("test");
        testList.add("test");
        assertFalse(testList.remove("not found"));
    }

    @Test
    void testRemoveInValueShouldReturnTrue(){
        MyArrayList<String> testList = new MyArrayList(5);
        testList.add("test");
        testList.add("alex");
        testList.add("stop");
        assertTrue(testList.remove("alex"));
    }

    @Test
    void testGetShouldReturnElement(){
        assertEquals(32,beforeMyArrayList.get(2));
    }

    @Test
    void testIndexOfShouldReturnNegativeOneForValueNotFound(){
        assertEquals(-1,beforeMyArrayList.indexOf(1000));
    }

    @Test
    void testIndexOfShouldReturnIndexForCorrectValue(){
        assertEquals(2,beforeMyArrayList.indexOf(32));
    }

    @Test
    void testAddIndexAndValueShouldReturnTrue(){
        assertTrue(beforeMyArrayList.add(3,100));
    }
    @Test
    void testAddIndexAndValueShouldInstallValueForIndex(){
        beforeMyArrayList.add(3,100);
        assertEquals(100,beforeMyArrayList.get(3));
    }

    @Test
    void testSetShouldReturnOldValue(){
        assertEquals(32,beforeMyArrayList.set(2,100));
    }

    @Test
    void testSetShouldInstallValueForIndex(){
        beforeMyArrayList.set(2,100);
        assertEquals(100,beforeMyArrayList.get(2));
    }

    @Test
    void testContainsShouldReturnFalseIfValueNotFound(){
        assertFalse(beforeMyArrayList.contains(100));
    }

    @Test
    void testContainsShouldReturnFalseIfValueNull(){
        assertFalse(beforeMyArrayList.contains(null));
    }

    @Test
    void testContainsShouldReturnTrueIfCorrectValue(){
        assertTrue(beforeMyArrayList.contains(32));
    }

    @Test
    void testIsEmptyShouldReturnTrueIfListEmpty(){
        MyArrayList<String> testList = new MyArrayList(5);
        assertTrue(testList.isEmpty());
    }

    @Test
    void testIsEmptyShouldReturnFalseIfListNotEmpty(){
        assertFalse(beforeMyArrayList.isEmpty());
    }
    @Test
    void testClearShouldDeleteAllElements(){
        beforeMyArrayList.clear();
        assertEquals(0,beforeMyArrayList.size());
    }

    @Test
    void testSortByToStringShouldSortedList(){
        List<String> testList = new ArrayList<>();
        testList.add("test");
        testList.add("Alex");
        testList.add("stop");
        Collections.sort(testList);
        MyArrayList<String> testMyList = new MyArrayList(3);
        testMyList.add("test");
        testMyList.add("Alex");
        testMyList.add("stop");
        testMyList.sortByToString();
        assertArrayEquals(testList.toArray(),testMyList.getArrayValue());
    }

    @Test
    void testBubbleSortMethodShouldSortedIntegerClass(){
        List<Integer> testList = new ArrayList<>();
        testList.add(53);
        testList.add(4);
        testList.add(32);
        testList.add(2);
        testList.add(1);
        testList.add(56);
        Collections.sort(testList);
        beforeMyArrayList.bubbleSortMethod(beforeMyArrayList);

        assertArrayEquals(testList.toArray(), beforeMyArrayList.getArrayValue());


    }

}