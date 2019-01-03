package com.stackroute.unittest.PE5;
import java.util.ArrayList;

public class UpdateArrayList {

    public static ArrayList<String> updateArray(ArrayList<String> arrayList,String addEle,int index)
    {
        arrayList.set(index,addEle);
        System.out.println(arrayList);
        return arrayList;
    }

    public ArrayList<String> deleteArray(ArrayList<String> arrayList) {
       arrayList.removeAll(arrayList);
        System.out.println(arrayList);
        return arrayList;
    }


}
