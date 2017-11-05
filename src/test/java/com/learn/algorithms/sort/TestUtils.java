package com.learn.algorithms.sort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.IntStream.of;

public class TestUtils {
    static int numberOfElements = 1_00_001;
    static Random rnd = new Random();
    static boolean printEnable = true;

    public static List<Integer> getInputList(){
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numberOfElements;i++){
            list.add(rnd.nextInt(numberOfElements));
        }


//        list = Stream.of(1,0,7,1,2,1,2,8,2,6).collect(Collectors.toList());
//        list = Stream.of(1,2,8,2,6).collect(Collectors.toList());
        return list;
    }

    public static void print(List<Integer> list){
        if(printEnable) {
            System.out.println();
            list.stream().forEach(it -> System.out.print(it + ","));
            System.out.println();
        }
    }
}
