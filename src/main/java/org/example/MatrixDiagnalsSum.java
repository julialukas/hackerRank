package org.example;

import java.util.ArrayList;
import java.util.List;

public class MatrixDiagnalsSum {
    public static void main(String[] args) {
List<List<Integer>>matrix= new ArrayList<List<Integer>>();

        List<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(100);
        List<Integer>list2=new ArrayList<>();
        list2.add(100);
        list2.add(5);
        list2.add(6);
        List<Integer>list3=new ArrayList<>();
        list3.add(8);
        list3.add(8);
        list3.add(10);
matrix.add(list1);
matrix.add(list2);
matrix.add(list3);
diagonalDifference(matrix);
    }
    /*
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1=0;
        int sum2=0;
        for (int i = 0; i <arr.size() ; i++) { //col
            System.out.println(arr.get(i));
            for (int j = 0; j <arr.get(i).size() ; j++) { //row

        if(i==j){
           sum1+=arr.get(i).get(j);

        }
if(i==(arr.get(i).size()-j-1)){
    sum2+=arr.get(i).get(j);
}
    //size 3
    //i 2 1 0
    //j 0 1 2
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
return Math.abs(
        sum1-sum2
);
    }

}
