package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindDuplicates {
   // How do you find the duplicate number on a given integer array?
/*
1. sort an array to bring up duplicates
2. assign first value from original array to a  new array
3. compare next value with the previous one if it doesnt match=> means its not a duplicate value
 add it to new array and assign previous value to added num  since array is sorted this approach will work
 4 on the spaces where we removed duplicates now will be zerros
 */

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
/*
int arrayName[] = new int[size];

Arrays.stream(arrayName).forEach(System.out::println);
 */
    public static void main(String[] args) {
        int arr []= {3,4,5,2,2,2,7,2,-1};
      Arrays.stream(findDuplicates(arr)).forEach(System.out::print);


    }

}
