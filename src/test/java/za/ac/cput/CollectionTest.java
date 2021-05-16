package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTest
{
   Collection c = new LinkedHashSet();

    @Test
    void add() {
        c.add("Felecia");
        c.add("Zweni");
        assertEquals(2, c.size());
    }


   @Test
    void remove(){
       c.add("Felecia");
       c.add("Zweni");

       c.remove("Felecia");
       System.out.println(c);
       assertEquals(1, c.size());
   }

   @Test
    void find(){
    c.add("Felecia");
    c.add("Zweni");

    if (c.contains("Felecia")){
        System.out.println("Felecia");
    }
    assertEquals(2, c.size());
   }

}
