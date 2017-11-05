package com.learn.algorithms.sort;

import java.util.List;

public class InsertionSort extends Sort {

    @Override
    public void sort(List<Integer> list) {
        for(int i=1;i<list.size();i++){
            if(list.get(i) < list.get(i-1)){
                insertValue(list, i);
            }
        }
    }

    public void insertValue(List<Integer> list, int rigthMargin){
        int j = rigthMargin;
        for(int i=rigthMargin-1;i>=0;i--){
            if(list.get(j) < list.get(i)){
                swap(list, i, j--);
            } else {
                break;
            }
        }
    }

}
