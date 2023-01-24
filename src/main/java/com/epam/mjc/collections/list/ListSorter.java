package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        List<Integer> newList = new ArrayList<>();
        Integer member = 0;
        for(String i : sourceList){
            int x = Integer.parseInt(i);
            member = 5*x^2+3;
            newList.add(member);
        }
        System.out.println(newList);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
    int x = 0;
        return x;
    }
}
