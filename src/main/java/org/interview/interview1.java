package org.interview;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class interview1 {


    public long findFactorial(int a){
        if(a==1){
            return 1;
        }
        if(a<=0){
            return 0;
        }

        return a*findFactorial(a-1);

    }

    public String reverseMe(String str){
        if(str.length()<=0){
            return null;
        }
        String reversed="";
        for (int i = str.length()-1; i>=0; i--) {
            reversed+=String.valueOf(str.charAt(i));
        }

        return reversed;
    }

    @Test
    public void testFactorial(){
        Assert.assertEquals(6,findFactorial(3));
    }

    @Test
    public void testString(){
        Assert.assertEquals("kari", reverseMe("irak"));
    }

}
