package org.example;

public class isPolindromeNumber {

    public static boolean isPalindrome(int num){

        // 1  char  true
        String str =  ""+num;
        if(str.length()==1)return true;
        if(str.length()<1)return false;
     StringBuilder sb = new StringBuilder(str);
     if(sb.reverse().toString().equals(str)) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(878));
    }
}
