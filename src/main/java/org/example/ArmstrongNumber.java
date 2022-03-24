package org.example;

public class ArmstrongNumber {

    public static boolean isArmstrong(int num){
String k = ""+num;
int sum =0;
for (int i=0; i<k.length();i++){
       int n = (Integer.parseInt(String.valueOf(k.charAt(i))));
       n=n*n*n;
       sum+=n;
        System.out.println(sum);

}

if(sum==num){

    return true;
}
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

}
