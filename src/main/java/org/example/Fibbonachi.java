package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Fibbonachi {


    public static void fibs(int num){
        int x=0, y=0, z=1;
        for (int i = 0; i <=num ; i++) {
      x=y;
      y=z;
      z=x+z;
            System.out.print(x+" ");
        }

    }


    public static int fibonacci(int number){
        //base case of recursion
        if(number<= 1){
            return number;
        }
        //recursive method call in java
        return fibonacci(number-2) + fibonacci(number -1);
    }



@Test
@Disabled
    public void fibTest1(){
        int expected=34;
             int result= fibonacci(9);
    Assert.assertEquals(expected,result);
}

@Test
@DisplayName("Testing  zeroes")
    public void fibTest2(){
        int extected= 0;
        int result = fibonacci(0);
        Assert.assertEquals(extected,result);
}

    @Test
    @DisplayName("Testing  zeroes")
    public void fibTest3(){
        int extected= -99;
        int result = fibonacci(-99);
        Assert.assertEquals(extected,result);
    }

}
