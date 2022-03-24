package org.example;

public class Finra {
    public static void main(String[] args) {
        System.out.println(findSum("3.34567","9800.9807"));
    }

    /*
    2.349   076.59
    59.67   943.2

    34566788996544.678
    3456.98

           8108*/
    public static String findSum(String str1, String str2){
        //find how many digits after dot
        int dot1=0;
        int dot2=0;
        String sum ="";
        str1=new StringBuilder(str1).reverse().toString();
        str2=new StringBuilder(str2).reverse().toString();

        boolean  swap =  str1.length()<str2.length();
        if(swap) {

            for (int i = 0; i <str1.length(); i++) {
if (str1.charAt(i)=='.'){
    dot1=i;
}

            }
        }

int dif=dot1-dot2;
      if(dif>0){
          for (int i = 0; i <dif ; i++) {
              str2.concat("0");

          }
      }

        //



        int dot=dot1>dot2?dot1:dot2;

        System.out.println(dot);
        return null;

    }
}
