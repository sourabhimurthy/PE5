package com.stackroute.PE5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortingSetTest {
    SortingSet set1;

    @Test
    public void sortedSet() {
        set1=new SortingSet();
        String[] array=new String[5];
        array[0]="Bluto";
        array[1]="Olive";
        array[2]="Alice";
        array[3]="Harry";
        array[4]="Eugene";
        Set<String> s1=new TreeSet<String>() ;
        s1.add(array[0]);
        s1.add(array[1]);
        s1.add(array[2]);
        s1.add(array[3]);
        s1.add(array[4]);
        System.out.println(s1);
        assertEquals(s1,set1.sortedSet(array));
    }

    @Test
    public void convertToList() {
        set1=new SortingSet();
        Set<String> s1=new TreeSet<String>() ;
        s1.add("Alice");
        s1.add("Bluto");
        s1.add("Eugene");
        s1.add("Harry");
        s1.add("Olive");
        List<String> l1=new ArrayList(s1);
        assertEquals(l1,set1.convertToList(s1));
    }

    @Test
    public void sortedSet1() {
        set1=new SortingSet();
        String[] array=new String[5];
        array[0]="Bluto";
        array[1]="Olive";
        array[2]="Alice";
        array[3]="Harry";
        array[4]="Eugene";
        Set<String> s1=new TreeSet<String>() ;
        s1.add(array[0]);
        s1.add(array[1]);
        s1.add(array[2]);
        s1.add(array[3]);
        s1.add("Rain");
        System.out.println(s1);
        assertNotSame(s1,set1.sortedSet(array));
    }

    @Test
    public void convertToList1() {
        set1=new SortingSet();
        Set<String> s1=new TreeSet<String>() ;
        s1.add("Alice");
        s1.add("Bluto");
        s1.add("Eugene");
        s1.add("Harry");
        s1.add("Olive");
        List<String> l1=new ArrayList(s1);
        l1.add("Hello");
        assertNotSame(l1,set1.convertToList(s1));
    }
}