package com.stackroute.unittest.PE5;

import java.util.HashMap;
import java.util.Map;

public class CountOfChar {

    static Map<String,Boolean> characterCount(String[] array)
    {
        // Creating a HashMap containing char
        // as a key and occurrences as a value
        HashMap<String,Boolean> charCountMap = new HashMap<String, Boolean>();//for result

        Map<String, Integer> hm = new HashMap<String, Integer>();
        if(array.length==0)
        {
            return null;
        }
        int index=0;


        for (String i : array) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        boolean flag=false;
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            int value=val.getValue();
            if(value>=2)
                flag=true;
            else
                flag=false;
            System.out.println("Element " + val.getKey() + " "
                    + "occurs"
                    + ": " + value + " times "+flag);
            charCountMap.put(val.getKey(),flag);
        }
        return charCountMap;

    }


}

