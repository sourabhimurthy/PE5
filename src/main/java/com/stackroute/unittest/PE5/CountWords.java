package com.stackroute.unittest.PE5;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static String countOfWords(String s)
    {   if(s.length()==0)
       {
        return null;
       }

        Map<String,Integer>words=new HashMap<String, Integer>();
        String[] array=s.split("[\\s+-@*_,?]");
             for (String token: array) {
            System.out.println(token);
            String word = token.toLowerCase();
            if (words.containsKey(word)) {
                int count = words.get(word); // get word count
                words.put(word, count + 1); // override word count
            } else {
                words.put(word, 1); // initial word count to 1
            }
        }
        return words.toString();
    }


}
