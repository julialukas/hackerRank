package org.example;

import java.util.*;

public class SORT_HASHMAP_VALUES {
    private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();

        // get the entry set
        Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();
        System.out.println(entrySet);

        // create a list since the set is unordered
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        System.out.println(entryList);

        // sort the list by value
        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
        System.out.println(entryList);

        // populate the new hash map
        for (Map.Entry<String, Integer> e : entryList)
            sortedByValue.put(e.getKey(), e.getValue());

        return sortedByValue;
    }

}
