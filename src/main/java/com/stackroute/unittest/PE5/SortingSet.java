package com.stackroute.unittest.PE5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingSet {

    public static Set<String> sortedSet(String[] array) {
        if(array.length==0)
        {
            return null;
        }
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
    {  if(input.size()==0)
    {
        return null;
    }
        List list=new ArrayList(input);
        System.out.println(list);
        return list;
    }


}
