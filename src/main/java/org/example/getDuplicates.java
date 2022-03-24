package org.example;

import java.util.*;

public class getDuplicates {



    public static Map<String,Integer> findDuplicates(String arr[]){
        Map<String,Integer> map=new HashMap<>();
        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 3);
        map.put("D", 4);

        Set set=new HashSet<>();
        List list=new ArrayList<>();

        for(Map.Entry<String, Integer> mapVal:map.entrySet()) {

            if(!set.add(mapVal.getValue())) {
                list.add(mapVal.getValue());

            }else {
                set.add(mapVal.getValue());
            }

        }

        for(Map.Entry<String, Integer> mapVal:map.entrySet()) {

            if(list.contains(mapVal.getValue())){

                System.out.println(mapVal.getKey() +":" + mapVal.getValue());
            }
        }
        return null;
    }
}
