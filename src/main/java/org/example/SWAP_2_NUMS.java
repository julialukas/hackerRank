package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SWAP_2_NUMS {
    public static void swapNumbers(int a, int b) {
        if(a==b){
            System.out.println("A and b are same ");
            return;
        }
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("a :"+  a);
        System.out.println("b :"+  b);

    }
// VOVEL

    public static boolean stringContainsVowels(String input) {

        return input.toLowerCase().matches(".*[aeiou].*");

    }
    @Test
public void happyPath(){
        swapNumbers(3,5);
        swapNumbers(0,0);
    }
}
