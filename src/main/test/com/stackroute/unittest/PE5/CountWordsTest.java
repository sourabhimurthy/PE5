package com.stackroute.unittest.PE5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountWordsTest {
    CountWords c1;

    @Before
    public void setUp() throws Exception {
        c1=new CountWords();
    }

    @After
    public void tearDown() throws Exception {
        c1=null;
    }

    @Test
    public void countOfWords() {
        assertEquals(("{one=5, two=2, three=2}"),c1.countOfWords("one one-one_two,three,one@three*one?two"));
    }

    @Test
    public void countOfWordsEquals() {
        assertEquals(("{gift=1, dress=1, world=1, happy=2, sad=1, hello=2}"),c1.countOfWords("hello hello happy sad dress gift happy world"));
    }

    @Test
    public void countOfWordsNotSame() {
        assertNotSame(("{gift=1, dress=1, world=1, happy=2, sad=1, hello=2}"),c1.countOfWords("hello hello happy sad dress gift happy world gift"));
    }

    @Test
    public void countOfWordsNull() {
        assertNull(null,c1.countOfWords(""));
    }
}