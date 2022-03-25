package org.example;

public class REVERSE_STRING {
    public static String reverseMe(String str){
        if(str.length()<=1){
            return str;
        }
  StringBuilder sb = new StringBuilder();
    for (int i =str.length()-1; i>=0;i--){
        System.out.println(i);
       sb.append(str.charAt(i));

    }
    return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseMe("Love"));
    }
}
