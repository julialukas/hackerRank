package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class POLINDROME {

    public static boolean isPalindrome(int num){

        // 1  char  true
        String str =  ""+num;
        if(str.length()==1)return true;
        if(str.length()<1)return false;
     StringBuilder sb = new StringBuilder(str);
     if(sb.reverse().toString().equals(str)) return true;
        return false;
    }

   static boolean checkPalindromeString(String input) {
        boolean result = true;

        String formatted = input.replace(" ","");
       int length = formatted.length();
        for(int i=0; i < length/2; i++) {
            if(formatted.charAt(i) != formatted.charAt(length-i-1)) {
                result = false;
                break;
            }
        }
        return result;
    }

@Test
    @DisplayName("happy path PALINDROME nums ")
@ParameterizedTest
@ValueSource(ints = {11,121,434,737})
    public void Test_HappyPath(int input){
        Assert.assertTrue(isPalindrome(input));
}

@Test
    @DisplayName("Check if string pallindrome without reverse method")
@ParameterizedTest
@ValueSource(strings = {"civic","race car","ama"})
    public void checkForPolindrome(String str){
    Assert.assertTrue(checkPalindromeString(str));
}
}
