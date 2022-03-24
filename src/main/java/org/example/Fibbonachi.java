package org.example;

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

    public static void main(String[] args) {
        fibs(9);
    }

}
