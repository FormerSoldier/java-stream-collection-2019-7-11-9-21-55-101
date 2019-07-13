package com.thoughtworks.collection;

import org.apache.commons.collections.IterableMap;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        /*int start = leftBorder < rightBorder ? leftBorder : rightBorder;
        int end = leftBorder < rightBorder ? rightBorder : leftBorder;
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += i % 2 == 0 ? i : 0;
        }
        return sum;*/

        return IntStream.rangeClosed(Math.min(leftBorder,rightBorder), Math.max(leftBorder,rightBorder))
                .filter(item -> item % 2 == 0)
                .reduce(0,(sum, item) -> sum += item);
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        return IntStream.rangeClosed(Math.min(leftBorder, rightBorder),Math.max(leftBorder,rightBorder))
                .filter(item -> item % 2 == 1).reduce(0,(sum, item) -> sum += item);
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item -> item*3+2).reduce(0,(sum, item) -> sum+= item);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item -> item %2 == 1 ? item * 3 + 2 : item).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 == 0).mapToDouble((item) -> item).average().getAsDouble();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 == 0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
