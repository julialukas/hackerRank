package org.example;

import java.util.ArrayList;
import java.util.List;

public class Kari {


    public static void main(String[] args) {
        List<Integer>arr=new ArrayList<>();
        arr.add(8);
        arr.add(3);
        arr.add(-1);
        arr.add(0);
        arr.add(7);
        arr.add(17);
        arr.add(-3);
        arr.add(6);
        arr.add(0);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i=1; i<arr.size(); i++){
            if(arr.get(i)>0){
                positive++;
            }else if(arr.get(i)<0){
                negative++;
            }else{
                zero++;
            }
        }
        double pRatio = (double) positive/arr.size();
        double nratio = (double) negative/arr.size();
        double zratio = (double) zero/arr.size();
        String [] arrs  ={String.valueOf(pRatio),String.valueOf(nratio),String.valueOf(zratio)};
        for (int i = 0; i <3 ; i++) {
            if (arrs[i].length()<8){
                arrs[i]+="000000000000000";
            }
        }

            System.out.println(arrs[0].substring(0,8));
            System.out.println(arrs[1].substring(0,8));
            System.out.println(arrs[1].substring(0,8));


    }
    }

