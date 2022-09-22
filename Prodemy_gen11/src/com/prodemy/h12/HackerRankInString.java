package com.prodemy.h12;

public class HackerRankInString {
    public static void main(String[] args) {
        String s = "hackkerbanker";
        char[] k = s.toCharArray();
        System.out.println(s.contains("ha"));
        String h = "hackerrank";
        String res = "No";
        for (int i = 0; i<s.length();i++){
            char[] def = h.toCharArray();
            if (k[i]==def[0]){
                if (h.length()==1) res = "Yes";
                else h = h.substring(1);
            }
        }
        System.out.println(res);
    }
}
