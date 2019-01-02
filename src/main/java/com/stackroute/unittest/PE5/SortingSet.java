package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingSet {

    public static Set<String> sortedSet(String[] array) {
        Set<String> treeSet = new TreeSet<>();
        int i = 0;
        while (i != array.length ) {
            treeSet.add(array[i]);
            System.out.println(treeSet);
            i++;
        }
        return treeSet;

    }
    public static List<String> convertToList(Set<String> input)
    {
        List list=new ArrayList(input);
        System.out.println(list);
        return list;
    }

    public static void main(String[] args)
    {
        String[] array= {"hello","happy","sad","good"};
        Set<String> s1=new TreeSet<>();
    List<String> l1=new ArrayList<>();
        s1=sortedSet(array);
                l1=convertToList(s1);
        System.out.println(l1);
    }
}
