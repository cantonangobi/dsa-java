package com.example.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayListTestSetInsert {
    @Test
    void arrayIndexZeroIsNine(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        assertEquals(5, list.getAt(0));
        assertEquals(6, list.getAt(1));
        assertEquals(7, list.getAt(2));
        assertEquals(8, list.getAt(3));

        list.setAt(0, 9);
        assertEquals(9, list.getAt(0));

    }
    void arrayIndexOneIsTen(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        assertEquals(5, list.getAt(0));
        assertEquals(6, list.getAt(1));
        assertEquals(7, list.getAt(2));
        assertEquals(8, list.getAt(3));

        list.setAt(0, 9);
        assertEquals(9, list.getAt(0));

        list.setAt(1, 10);
        assertEquals(10, list.getAt(1));

    }
    void arrayIndexTwoIsEleven(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        assertEquals(5, list.getAt(0));
        assertEquals(6, list.getAt(1));
        assertEquals(7, list.getAt(2));
        assertEquals(8, list.getAt(3));

        list.setAt(0, 9);
        assertEquals(9, list.getAt(0));
        
        list.setAt(1, 10);
        assertEquals(10, list.getAt(1));

        list.setAt(2, 11);
        assertEquals(11, list.getAt(2));

    }
    void arrayIndexTwoIsTwelve(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        assertEquals(5, list.getAt(0));
        assertEquals(6, list.getAt(1));
        assertEquals(7, list.getAt(2));
        assertEquals(8, list.getAt(3));

        list.setAt(0, 9);
        assertEquals(9, list.getAt(0));
        
        list.setAt(1, 10);
        assertEquals(10, list.getAt(1));

        list.setAt(2, 11);
        assertEquals(11, list.getAt(2));

        list.setAt(3, 12);
        assertEquals(12, list.getAt(3));

    }

    
    
}
