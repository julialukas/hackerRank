package org.example.demo;

public class calcObj {
    int input1;
    int input2;
    int expected;
    boolean condition;

    public int getInput1() {
        return input1;
    }

    public calcObj(int input1, int input2, int expected, boolean condition) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
        this.condition = condition;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput2() {
        return input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public int getExpected() {
        return expected;
    }

    public void setExpected(int expected) {
        this.expected = expected;
    }

    public boolean getCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
}
