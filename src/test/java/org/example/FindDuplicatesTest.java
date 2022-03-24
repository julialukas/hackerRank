package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;

public class FindDuplicatesTest {
    //data generator -120003457
    public  static int [][] data(){
        return new int[][] {{3,4,5,2,2,2,7,2,-1},{-1,2,0,0,0,3,4,5,7}};
    }
    @ParameterizedTest
    @MethodSource(value = "data")
    @DisplayName("Find duplicates values ")
     void testDuplicates(){
        FindDuplicates fd =new FindDuplicates();
        Arrays.stream(fd.findDuplicates(data()[0])).forEach(System.out::print);
        Assert.assertArrayEquals( fd.findDuplicates(data()[0]),data()[1]);
    }

}
