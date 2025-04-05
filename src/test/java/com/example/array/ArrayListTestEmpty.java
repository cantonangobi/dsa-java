package com.example.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ArrayListTestEmpty {
    //Test state of array called with default constructor without adding anything
    @Test
    void emptyDefaultArrayIsEmpty() {
        ArrayList<Integer> list = new ArrayList<>();
        assertTrue(list.isEmpty());
    }
    @Test
    void emptyDefaultArrayStringIsEmpty() {
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals("[]", list.toString());
    }
    
    @Test
    void emptyDefaultArrayHasSizeZero() {
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(0, list.size());
    }

    @Test
    void emptyDefaultArrayHasCapacityTen() {
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(10, list.getCapacity());
    }

    //Test state of array called with constructor without adding anything
    @Test
    void emptyArrayIsEmpty() {
        ArrayList<Integer> list = new ArrayList<>(20);
        assertTrue(list.isEmpty());
    }
    @Test
    void emptyArrayStringIsEmpty() {
        ArrayList<Integer> list = new ArrayList<>();
        assertSame("[]", list.toString());
    }
    
    @Test
    void emptyArrayHasSizeZero() {
        ArrayList<Integer> list = new ArrayList<>(20);
        assertEquals(0, list.size());
    }

    @Test
    void emptyArrayHasCapacityTen() {
        int capacity = 20;
        ArrayList<Integer> list = new ArrayList<>(capacity);
        assertEquals(capacity, list.getCapacity());
    }

    //Test Adding of elements
    
}
