package org.example;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String pattern1 = in.nextLine();
        while(testCases>0){
try{

    Pattern pattern = Pattern.compile(pattern1);
    System.out.println("Valid");
    testCases--;
}catch(Exception e){
    System.out.println("Invalid");
    testCases--;
}

        }



    }
}
