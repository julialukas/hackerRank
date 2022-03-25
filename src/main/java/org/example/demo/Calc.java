package org.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    public static int sumMe(int a, int b){
        return a+b;

    }

    @Test
    @DisplayName("Test sum happy path")
    public void sumTest1(){
        // condition result and exp input
        List<calcObj>data= getData();
        for (calcObj obj:data) {
            if (obj.getCondition()) {
                Assert.assertEquals(obj.getExpected(), sumMe(obj.input1, obj.input2));
            } else {
                Assert.assertNotEquals(obj.getExpected(), sumMe(obj.input1, obj.input2));
            }
        }

    }
    public List<calcObj> getData(){
        List<calcObj>res=new ArrayList<>();
        res.add(new calcObj(2,3,5,true));
        res.add(new calcObj(10,4,2,false));
        res.add(new calcObj(6,4,10,true));
        res.add(new calcObj(2,9,11,true));
        res.add(new calcObj(88,2,55,false));
        return res;
    }
}
