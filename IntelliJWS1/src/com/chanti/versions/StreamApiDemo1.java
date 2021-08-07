package com.chanti.versions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo1 {
    public static void main(String[] args) {
        List<Integer> allItems = Arrays.asList(100, 250, 1000, 600, 800);
        Stream<Integer> items = allItems.stream();
        //above500Items
        List<Integer> above500Items = items.filter(i -> i > 500).collect(Collectors.toList());
        //add15ToEach
        List<Integer> add15ToEach = items.map(i -> i + 15).collect(Collectors.toList());
        //totalItems
        int totalItems = items.reduce((i1, i2) -> (i1 + i2)).get().intValue();

        //filter+map+reduce
        int totalItemsAbove300= items
                .filter(i->i>300)
                .map(j->j+5)
                .reduce((a,b)->(a+b)).get().intValue();
    }
}
