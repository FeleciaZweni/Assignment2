package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class ListTest {

    ArrayList<String> list = new ArrayList<String>();
    @Test
    void add() {
        list.add("Zweni");
        list.add("Felecia");
        // System.out.println(list);
        assertEquals(2, list.size());

    }

    @Test
    void remove() {
        list.add("Zweni");
        list.add("Felecia");
        list.remove("Zweni");
        System.out.println(list);
        assertEquals(1, list.size());
    }

    @Test
    void find() {
        list.add("Zweni");
        list.add("Felecia");
        System.out.println(list.get(1));
        assertEquals(2, list.size());

    }

}
