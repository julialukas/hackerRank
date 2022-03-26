package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MAP_DUPLICATES {


    public static Map<String, Integer> findDuplicatesFunc(String arr []) {
        Map<String, Integer> map = new HashMap<>();
        if(arr==null){
            return null;
        }
        for (int i = 0; i < arr.length; i++) {
            int count = map.containsKey(arr[i]) ? map.get(arr[i]) : 0;
            map.put(arr[i], count + 1);
        }
        return map;
    }

    @Test
    @DisplayName("Test no duplicates scenario")

    public void test1(){
        Map<String, Integer>expeccted=new HashMap<>();
String input []=new String[]{"Kari","j"};
Map<String, Integer> expected= new HashMap<>();
        expected.put("Kari",1);
        expeccted.put("j",1);
        Map<String, Integer>res=findDuplicatesFunc(input);


    }
}
