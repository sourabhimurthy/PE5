package com.stackroute.unittest.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

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
        arr.add(new StudentClass(150,18,"John"));
        arr.add(new StudentClass(120,15,"Kiran"));
        arr.add(new StudentClass(130,16,"Rahul"));
        arr.add(new StudentClass(140,16,"Meera"));
        arr.add(new StudentClass(140,16,"Joe"));
        arr.add(new StudentClass(140,18,"Smith"));
        ArrayList<StudentClass>arr1=new ArrayList<StudentClass>();
        arr1.add(new StudentClass(120,15,"Kiran"));
        arr1.add(new StudentClass(140,16,"Joe"));
        arr1.add(new StudentClass(140,16,"Meera"));
        arr1.add(new StudentClass(130,16,"Rahul"));
        arr1.add(new StudentClass(140,18,"Smith"));
        arr1.add(new StudentClass(150,18,"John"));
        assertNotSame("Eroor",arr1.toString(),obj.Sortstudent(arr).toString());
    }

    @Test
    public void sortstudentEquals() {
        ArrayList<StudentClass> arr=new ArrayList<StudentClass>();
        arr.add(new StudentClass(150,18,"John"));
        arr.add(new StudentClass(120,15,"Kumar"));
        arr.add(new StudentClass(130,16,"Rahul"));
        arr.add(new StudentClass(140,16,"Mukundh"));
        arr.add(new StudentClass(140,16,"Joe"));
        arr.add(new StudentClass(140,18,"Anil"));
        ArrayList<StudentClass>arr1=new ArrayList<StudentClass>();
        arr1.add(new StudentClass(120,15,"Kumar"));
        arr1.add(new StudentClass(140,16,"Joe"));
        arr1.add(new StudentClass(140,16,"Mukundh"));
        arr1.add(new StudentClass(130,16,"Rahul"));
        arr1.add(new StudentClass(140,18,"Anil"));
        arr1.add(new StudentClass(150,18,"John"));
        assertEquals("Eroor",arr1.toString(),obj.Sortstudent(arr).toString());
    }
}

