package com.learn.algorithms.sort;

import java.util.List;

public class BubbleSort extends Sort {

    int min = Integer.MAX_VALUE;

    private boolean sortIteration(List<Integer> list){
        boolean sortFinished = true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                swap(list, i,i+1);
                sortFinished = false;
            }
        }
        return sortFinished;
    }

    @Override
    public void sort(List<Integer> list) {
        for(int i=0;i<list.size();i++){
            if(sortIteration(list)) break;
        }
    }
}
