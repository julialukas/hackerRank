package org.example;

import java.util.ArrayList;
import java.util.List;

public class minMaxMin {

    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
nums.add(5);
nums.add(5);
nums.add(5);
nums.add(5);
nums.add(5);
        minMax(nums);
    }
    public static void minMax(List<Integer>num){
        int max=0;
        int min=100000000;
        for (int i=0; i<5;i++){
            if(num.get(i)<min){
                min=num.get(i);
            }
            if(num.get(i)>max){
                max=num.get(i);
            }
        }
        int maxSum=0;
        int minSum=0;
        for (int i=0; i<5;i++){
            if(num.get(i)!=min){
                maxSum+=num.get(i);
            }
            if(num.get(i)!=max){
                minSum+=num.get(i);
            }
        }
        System.out.println(maxSum);
        System.out.println(minSum);

    }
}
