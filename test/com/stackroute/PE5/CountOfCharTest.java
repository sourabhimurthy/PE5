package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountOfCharTest {
    CountOfChar c1;

    @Before
    public void setUp() throws Exception {
        c1=new CountOfChar();
    }

    @After
    public void tearDown() throws Exception {
        c1=null;
    }

    @Test
    public void characterCount() {
        String arr[] = {"a","b","c","d","a","c","c"};
        HashMap<String,Boolean> charCountMap = new HashMap<String, Boolean>();
        charCountMap.put("a",true);
        charCountMap.put("b",false);
        charCountMap.put("c",true);
        charCountMap.put("d",false);

        assertEquals(charCountMap,c1.characterCount(arr));
    }

    @Test
    public void characterCount1() {
        String arr[] = {"a","b","c","d","a","c","c","e","f"};
        HashMap<String,Boolean> charCountMap = new HashMap<String, Boolean>();
        charCountMap.put("a",true);
        charCountMap.put("b",false);
        charCountMap.put("c",true);
        charCountMap.put("d",false);
        charCountMap.put("e",false);
        charCountMap.put("f",false);

        assertEquals(charCountMap,c1.characterCount(arr));
    }
}