package com.learn.algorithms.sort;

import java.util.List;

public class MergeSort extends Sort {
    @Override
    public void sort(List<Integer> list) {
        int middle = (list.size() / 2);
        mergeChunks(list, 0, middle, middle+1, list.size()-1);
    }

    private void mergeChunks(List<Integer> list, int left1, int right1, int left2, int right2){
        if(left2 > right2) {
            return;
        }

        int middle1 = (right1 - left1) / 2 + left1;
        int middle2 = (right2 - left2) / 2 + left2;

        mergeChunks(list, left1, middle1, middle1+1, right1);
        mergeChunks(list, left2, middle2, middle2+1, right2);

        int index = left1;
        for(int i=left1;i<=right1;i++){
            int k = 0;
            for(int j=left2;j<=right2;j++) {
                if (list.get(index) >= list.get(j)) {
                    k++;
                } else {
                    break;
                }
            }
            if(k>0){
                list.add(left2 + k, list.get(index));
                list.remove(index);
            } else {
                index++;
            }
        }

    }
}
