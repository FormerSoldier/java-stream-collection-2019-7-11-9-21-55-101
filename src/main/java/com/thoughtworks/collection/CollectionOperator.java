package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        int start = left < right ? left : right;
        int end = left < right ? right : left;
        List<Integer> list = new ArrayList<>();
        boolean reverse =left > right;
        for(int i = start; i <= end; i++)
            list.add(i);
        if(reverse)
            Collections.reverse(list);
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        return getListByInterval(left,right).stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = new ArrayList<>(array.length);
        for(int i = 0; i < array.length ; i ++)
            list.add(array[i]);
        return list.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
