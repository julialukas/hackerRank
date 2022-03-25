package org.example;

import java.util.HashSet;
import java.util.Set;

public class UNIQUE_CHARS {

    public static boolean checkIfAllUnique(String str){
Set<Character> unique= new HashSet<>();
char arr[]= str.toCharArray();
        for (int i = 0; i <arr.length ; i++) {

           if(!unique.add(arr[i])){
               return false;
           }

        }
        return true;
    }

    //FIND DISTINCT CHARS IN A STRING

    public static void main(String[] args) {
        System.out.println(checkIfAllUnique("dfljg"));
    }

}
