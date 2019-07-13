package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = IntStream.rangeClosed(Math.min(left, right),Math.max(left, right))
                .boxed()
                .collect(Collectors.toList());
        if(left > right)
            Collections.reverse(list);
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = IntStream.rangeClosed(Math.min(left, right),Math.max(left, right))
                .boxed()
                .filter(item -> item % 2 == 0)
                .collect(Collectors.toList());
        if(left > right)
            Collections.reverse(list);
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        return IntStream.of(array).filter(item -> item % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
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
