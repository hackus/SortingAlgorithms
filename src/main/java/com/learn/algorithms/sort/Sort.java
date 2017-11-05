package com.learn.algorithms.sort;

import java.util.List;

public abstract class Sort implements Sortable {

    protected void swap(List<Integer> list, int i, int j){
        int aux = list.get(i);
        list.set(i,list.get(j));
        list.set(j,aux);
    }
}
