import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
    @BeforeEach
    public void createNewMyLinkedList() {
        integerMyLinkedList.add(1);
        integerMyLinkedList.add(20);
        integerMyLinkedList.add(15);
        integerMyLinkedList.add(8);
    }

    @Test
    void testAdd() {
        integerMyLinkedList.add(18);
        assertEquals(18, integerMyLinkedList.get(integerMyLinkedList.size()-1).getData());
    }

    @Test
    void get() {
        assertEquals(1,integerMyLinkedList.get(0).getData());
    }

    @Test
    void testRemoveFirst() {
        assertTrue(integerMyLinkedList.removeFirst());
    }

    @Test
    void removeLast() {
        assertTrue(integerMyLinkedList.removeLast());

    }

    @Test
    void removeAt() {
        assertTrue(integerMyLinkedList.removeAt(15));

    }

    @Test
    void testSize() {
        assertEquals(integerMyLinkedList.getArrayValueIndex(),integerMyLinkedList.size());
    }

    @Test
    void set() {

    }
}