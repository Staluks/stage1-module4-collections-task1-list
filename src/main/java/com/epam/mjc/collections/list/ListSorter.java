package com.epam.mjc.collections.list;

import com.sun.jdi.IntegerValue;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator com = new ListComparator();
        Collections.sort(sourceList, com);
        System.out.println(sourceList);

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
   if(a == b) {

       return 0;
   }
   if(a == null){
       return -1;
   }
   if(b == null){
       return 1;
   }
   Integer x = 5*(Integer.parseInt(a))*(Integer.parseInt(a))+3;
   int y = 5*(Integer.parseInt(b))*(Integer.parseInt(b))+3;
   if(x == y){
       return Integer.valueOf(a).compareTo(Integer.valueOf(b));
   }
        return x.compareTo(y);
    }
}
