package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DUPLICATES_ARRAY {

    public static boolean checkDuplicateUsingSet(String[] input) {
        List inputList = Arrays.asList(input);
        Set inputSet = new HashSet(inputList);
        if (inputSet.size() < inputList.size()){
            return true;
        }
            return false;
    }

    public static int[] findDuplicates(int arr[]){
        Arrays.sort(arr);
        int result []= new int[arr.length];
        int previous=arr[0];
        result[0]=previous;
        for (int i=1;i<arr.length;i++){
            int each = arr[i];
            if(each!=previous){
                result[i]=each;
            }
            previous= each;

        }
        return result;

    }

    public static void main(String[] args) {
        String arr [] = {"kari", "Cali", "kari"};
        System.out.println(checkDuplicateUsingSet(arr));

        int arr2 []= {3,4,5,2,2,2,7,2,-1};
        Arrays.stream(findDuplicates(arr2)).forEach(System.out::print);
    }
}


