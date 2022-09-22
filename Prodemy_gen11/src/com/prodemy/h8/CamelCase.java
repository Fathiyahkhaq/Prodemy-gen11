package com.prodemy.h8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        String s = "saveTheChanges";
        char[] test = {'B','a','A'};
        Arrays.sort(test);
        System.out.println(test);

        int count = 1;
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
                count++;
            }
        }
        System.out.println(count);

        Scanner sc = new Scanner(System.in);
        int i=0;
        while(sc.hasNext()){
            System.out.println(i++ + " "+sc.nextLine());
        }

    }
}
