package com.stackroute.unittest.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortingSetTest {
    SortingSet set1;

    @Before
    public void setUp() throws Exception {
        set1=new SortingSet();
    }

    @After
    public void tearDown() throws Exception {
        set1=null;
    }

    @Test
    public void sortedSet() {

        String[] array=new String[]{"Bluto","Olive","Alice","Harry","Eugene"};
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
    public void sortedSetNotSame() {

        String[] array=new String[]{"Bluto","Olive","Alice","Harry","Eugene"};

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
    public void convertToListNotSame() {

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



    @Test
    public void sortedSetNull() {

        String[] array=new String[]{};
        //System.out.println(s1);
        assertNull(null,set1.sortedSet(array));
    }

    @Test
    public void convertToListNull() {
        Set<String> s1=new TreeSet<String>() ;
        List<String> l1=new ArrayList(s1);
        assertNull(null,set1.convertToList(s1));
    }


    @Test
    public void sortedSetOneEle() {

        String[] array=new String[]{"Hello"};
        Set<String> s1=new TreeSet<String>() ;
        s1.add(array[0]);
        //System.out.println(s1);
        assertEquals(s1,set1.sortedSet(array));
    }

    @Test
    public void convertToListOneEle() {
        Set<String> s1=new TreeSet<String>() ;
        s1.add("Hello");

        List<String> l1=new ArrayList(s1);
        assertEquals(l1,set1.convertToList(s1));
    }
}