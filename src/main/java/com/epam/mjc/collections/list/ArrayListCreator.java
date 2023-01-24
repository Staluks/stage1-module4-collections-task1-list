package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> newList = new ArrayList<>();
        for(int i = 0; i<sourceList.size(); i++ ){
            if((i+1)%3 == 0){
                newList.add(sourceList.get(i));
                newList.add(sourceList.get(i));
            }
        }
        return newList;
    }
}
