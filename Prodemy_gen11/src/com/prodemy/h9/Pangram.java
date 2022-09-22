package com.prodemy.h9;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next prize";

        s = s.toLowerCase();
        s.split("");
        char[] charVersion = s.toCharArray();
        HashSet<Character> hurufCollection = new HashSet<>();
        for (Character i: charVersion) {
            hurufCollection.add(i);
        }
        String res;
        if (hurufCollection.size()==27){
            res = "Pangram";
        } else {
            res = "Not Pangram";
        }
        System.out.println(charVersion);
        System.out.println(hurufCollection);
        System.out.println(res);
//        s.replaceFirst("w"," ");
//        System.out.println(s);
        s = s.replace(s.charAt(0), 'x');
        System.out.println(s);

        //String reverse
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        /* Enter your code here. Print output to STDOUT. */
        int n= A.length();
        char S=0;
        String output="";
        for (int i=n-1;i>=0;i--){
            S = A.charAt(i);
            for(int j=0; j<n;j++){
                if(S==A.charAt(j)) output = "Yes";
                else output = "No";
            }
        }
        System.out.println(output);
    }

}
