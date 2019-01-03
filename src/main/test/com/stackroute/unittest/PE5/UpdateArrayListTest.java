package com.stackroute.unittest.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UpdateArrayListTest {
    UpdateArrayList u1;

    @Before
    public void setUp() throws Exception {
        u1=new UpdateArrayList();
    }

    @After
    public void tearDown() throws Exception {
        u1=null;
    }

    @Test
    public void updateArray() {
        ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(new String[]{"Apple","Grape","Melon","Berry"}));
         assertEquals(arrayList,u1.updateArray(arrayList,"Kiwi",0));
    }

    @Test
    public void deleteArray() {
        ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(new String[]{"Apple","Grape","Melon","Berry"}));
        assertEquals(arrayList,u1.deleteArray(arrayList));
    }


}