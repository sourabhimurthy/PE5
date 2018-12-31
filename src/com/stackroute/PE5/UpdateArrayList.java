package com.stackroute.PE5;
import java.util.ArrayList;

public class UpdateArrayList {

    public ArrayList<String> updateArray(ArrayList<String> arrayList,String addele,int index)
    {
        arrayList.set(index,addele);
        System.out.println(arrayList);
        return arrayList;
    }

    public ArrayList<String> deleteArray(ArrayList<String> arrayList) {
       arrayList.removeAll(arrayList);
        System.out.println(arrayList);
        return arrayList;
    }

    public static void main(String[] args)
    {
        ArrayList<String> arrayList=new ArrayList<String >();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");
        UpdateArrayList obj=new UpdateArrayList();
        obj.updateArray(arrayList,"Kiwi",0);
        obj.deleteArray(arrayList);

    }
}
