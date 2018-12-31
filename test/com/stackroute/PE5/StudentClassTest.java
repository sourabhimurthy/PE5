package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class StudentClassTest {
    Maintest obj;
    @Before
    public void setUp() throws Exception {
        obj=new Maintest();
    }
    @After
    public void tearDown() throws Exception {
        obj=null;
    }
    @Test
    public void sortstudent() {
        ArrayList<StudentClass> arr=new ArrayList<StudentClass>();
        arr.add(new StudentClass(150,18,"Keshav"));
        arr.add(new StudentClass(120,15,"Kumar"));
        arr.add(new StudentClass(130,16,"Rahul"));
        arr.add(new StudentClass(140,16,"Mukul"));
        arr.add(new StudentClass(140,16,"Joe"));
        arr.add(new StudentClass(140,18,"Adam"));
        ArrayList<StudentClass>arr1=new ArrayList<StudentClass>();
        arr1.add(new StudentClass(120,15,"Kumar"));
        arr1.add(new StudentClass(140,16,"Joe"));
        arr1.add(new StudentClass(140,16,"Mukul"));
        arr1.add(new StudentClass(130,16,"Rahul"));
        arr1.add(new StudentClass(140,18,"Adam"));
        arr1.add(new StudentClass(150,18,"Keshav"));
        assertEquals("Eroor",arr1.toString(),obj.Sortstudent(arr).toString());
    }
}

