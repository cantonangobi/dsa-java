package com.example.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class ArrayListTestAddGet {
    //check if empty
    @Test
    void arrayIsNotEmpty(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        assertFalse(list.isEmpty());
    }

    //check size
    @Test
    void arraySizeIsOne(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        assertEquals(1, list.size());
    }

    @Test
    void arraySizeIsTwo(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        assertEquals(2, list.size());
    }

    @Test
    void arraySizeIsThree(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        assertEquals(3, list.size());
    }

    @Test
    void arraySizeIsFour(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        assertEquals(4, list.size());
    }
    
    
    // Test Get
    @Test
    void arrayIndexzeroIsFive(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        assertEquals(5, list.getAt(0));
    }
    @Test
    void arrayStringOneValueIsCorrect(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        assertEquals("[ 5 ]", list.toString());
    }

    @Test
    void arrayIndexOneIsSix(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        assertEquals(5, list.getAt(0));
        assertEquals(6, list.getAt(1));
    }
    @Test
    void arrayIndexTwoIsSeven(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        assertEquals(5, list.getAt(0));
        assertEquals(6, list.getAt(1));
        assertEquals(7, list.getAt(2));
    }
    @Test
    void arrayIndexThreeIsEight(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        assertEquals(5, list.getAt(0));
        assertEquals(6, list.getAt(1));
        assertEquals(7, list.getAt(2));
        assertEquals(8, list.getAt(3));
    }
    @Test
    void arrayStringIsCorrect(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        assertEquals("[ 5, 6, 7, 8 ]", list.toString());
    }
}
