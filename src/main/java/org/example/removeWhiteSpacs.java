package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    static String removeWhiteSpacesFunc(String input){
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();

        for(char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String s = "  j kari\t";
        s = s.trim();
        System.out.println(s);
    }

@Test
    @ParameterizedTest
    @ValueSource(strings = {"he  llo", "karinka","Ukraine","  ", " ,"})
    @DisplayName("Remove whitespace test")
    public void removeWhite(String input){
        removeWhiteSpacesFunc(input);
}
}

