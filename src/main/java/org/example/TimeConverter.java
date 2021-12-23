package org.example;

public class TimeConverter {
    public static void main(String[] args) {
timeConversion("07:05:45PM");
    }

    public static void timeConversion(String s) {
        // Write your code here
String del=s.substring(8,10);
String first2=s.substring(0,2);
int first2Int=Integer.parseInt(first2);
String theRest=s.substring(2,8);
if(del.equals("PM")){
    if(first2Int!=12){
        first2Int+=12;

    }else{

    }
    System.out.println(first2Int+theRest);
}else{
    //AM
    if(first2Int!=12){
        System.out.println(s.substring(0,8));
    }else{
        first2Int-=12;
        System.out.println(first2Int+"0"+theRest);
    }

}

    }

}
