package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


public class SetTest {

    Set<String> carSet = new HashSet<>();

    @Test
    void add(){
        carSet.add("G63");
        carSet.add("Mercedes");
        assertEquals(2,carSet.size());

    }

    @Test
    void remove(){
        carSet.add("G63");
        carSet.add("Mercedes");
        carSet.remove("Mercedes");
        System.out.println(carSet);
        assertEquals(1, carSet.size());

    }

    @Test
    void find(){
        carSet.add("G63");
        carSet.add("Mercedes");
        if (carSet.contains("G63")){
            System.out.println("Mercedes");
        }
        assertEquals(2,carSet.size());

    }

}
