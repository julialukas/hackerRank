package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FACTORIAL {

    public static long factorial(long n) {
        if(n<0){
            return -1;
        }
        if (n == 1|| n==0)
            return n;
        else
            return (n * factorial(n - 1));
    }

    @Test
    @DisplayName("Testing FACTORIAL")
    @ParameterizedTest
    @ValueSource(ints = {5})
    public void testFactorial1(int input){
        factorial(input);
      Assert.assertEquals(120,factorial(input));
    }
}
