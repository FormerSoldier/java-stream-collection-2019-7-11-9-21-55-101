package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.awt.event.ItemEvent;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(item -> item %2 == 0).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(item -> item %3 == 0).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        //return firstList.stream().filter(item -> secondList.stream().anyMatch(item)).collect(Collectors.toList());
        return null;
    }

    public List<Integer> getDifferentElements() {
        return array.stream().distinct().collect(Collectors.toList());
    }
}