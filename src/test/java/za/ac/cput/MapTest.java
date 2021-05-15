package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class MapTest {

    Map<Integer,String> map = new HashMap<>();

    @Test
    void add() {
        map.put( 5, "Felecia");
        assertEquals(1, map.size());
        map.put( 6, "Zweni");
        assertEquals(2, map.size());

    }

    @Test
    void remove() {
        map.put( 5,"Felecia");
        map.put( 6,"Zweni");

        map.remove(5);
        System.out.println(map);
        assertEquals(1, map.size());

    }

    @Test
    void find(){
        map.put( 5,"Felecia");
        map.put( 6,"Zweni");
        //map.get(5);
        System.out.println(map.get(5));
    }


}
