package com.stackroute.PE5;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class ReplaceValueTest {
    ReplaceValue map;
    @Test
    public void modifySuccess() {
        map=new ReplaceValue();
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        HashMap<String ,String> res=new HashMap<>();
        res.put("val1"," ");
        res.put("val2","java");
        assertEquals(res,map.modify(hashMap));
    }
    @Test
    public void modifyFailure() {
        map=new ReplaceValue();
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        HashMap<String ,String> res=new HashMap<>();
        res.put("val1"," ");
        res.put("val2","c++");
        assertNotSame(res,map.modify(hashMap));
    }

    @Test
    public void modifyNotNUll() {
        map=new ReplaceValue();
        LinkedHashMap<String ,String> hashMap=new LinkedHashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        assertNotNull("Error",map.modify(hashMap));
    }
}


