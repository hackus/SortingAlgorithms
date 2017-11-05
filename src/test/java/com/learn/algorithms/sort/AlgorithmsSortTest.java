package com.learn.algorithms.sort;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class AlgorithmsSortTest {
    @Test
    public void testSelectionSort() throws InstantiationException, IllegalAccessException {
        runSort(SelectionSort.class);
    }

    @Test
    public void testBubbleSort() throws InstantiationException, IllegalAccessException {
        runSort(BubbleSort.class);
    }

    @Test
    public void testInsertionSort() throws InstantiationException, IllegalAccessException {
        runSort(InsertionSort.class);
    }

    @Test
    public void testMergeSort() throws InstantiationException, IllegalAccessException {
        runSort(MergeSort.class);
    }

    public <T extends Sortable> void runSort(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T sort = clazz.newInstance();
        List<Integer> list = TestUtils.getInputList();
        TestUtils.print(list);
        sort.sort(list);
        TestUtils.print(list);
        assertTrue(checkSorting(list));
    }

    public boolean checkSorting(List<Integer> list){
        boolean sortingFailed = false;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i) > list.get(i+1)){
                sortingFailed = true;
                System.out.println(String.format("Failed at index %d", i));
                break;
            }
        }
        return !sortingFailed;
    }
}
