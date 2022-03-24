package org.example;

public class removeWhiteSpacs {

    public static void removeWhiteSpaces(String str){
        StringBuilder formatted= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != 32){
formatted.append(str.charAt(i));


            }
        }
        System.out.println(formatted);
    }

    public static void main(String[] args) {
        removeWhiteSpaces("ndhsg  ksjs kd  ");
    }
}
