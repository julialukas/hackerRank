package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class scannerPracticeList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int N = sc.nextInt();
        String arr = sc.next();
        int q = sc.nextInt();

        List<String> arrNums = new ArrayList<>();
        String[] kari = arr.split(" ");
        for (String s : kari) {
            arrNums.add(s);
        }
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            String positions = sc.next();


            if (query.equals("Insert")) {
                String[] p = positions.split(" ");

                int positionNum = Integer.parseInt(p[0]);
                arrNums.add(positionNum, p[1]);
            } else if (query.equals("Delete")) {


                arrNums.remove(Integer.parseInt(positions));

            }

        }
        System.out.println(arrNums);

    }
}
