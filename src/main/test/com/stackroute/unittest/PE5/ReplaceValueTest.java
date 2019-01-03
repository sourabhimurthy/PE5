package com.stackroute.unittest.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class ReplaceValueTest {
    ReplaceValue map;

    @Before
    public void setUp() throws Exception {
        map=new ReplaceValue();
    }

    @After
    public void tearDown() throws Exception {
        map=null;
    }

    @Test
    public void modifyValueSuccess() {

        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        HashMap<String ,String> res=new HashMap<>();
        res.put("val1"," ");
        res.put("val2","java");
        assertEquals(res,map.modifyValue(hashMap));
    }
    @Test
    public void modifyFailure() {

        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        HashMap<String ,String> res=new HashMap<>();
        res.put("val1"," ");
        res.put("val2","c++");
        assertNotSame(res,map.modifyValue(hashMap));
    }

    @Test
    public void modifyNotNUll() {
        map=new ReplaceValue();
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        assertNotNull("Error",map.modifyValue(hashMap));
    }

    @Test
    public void modifyNUll() {

        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        assertNull(null,map.modifyValue(hashMap));
          }


}


