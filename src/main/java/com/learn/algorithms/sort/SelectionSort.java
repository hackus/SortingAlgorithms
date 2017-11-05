package com.learn.algorithms.sort;

import java.util.List;

public class SelectionSort extends Sort {

    private void sortIteration(List<Integer> list, int sortingIndex){
        int min = Integer.MAX_VALUE;
        int index = -1;
        boolean minChanged = false;
        for(int i=sortingIndex;i<list.size();i++){
            if(list.get(i) < min){
                min = list.get(i);
                index = i;
                minChanged = true;
            }
        }
        if(minChanged){
            list.set(index, list.get(sortingIndex));
            list.set(sortingIndex, min);
        }
    }

    public void sort(List<Integer> list){
        for(int i=0;i<list.size();i++){
            sortIteration(list, i);
        }
    }
}
