package com.prodemy.h14;

public class RepeatString {
    public static void main(String[] args) {
        long n = 10;
        String s = "aba";
        long res = 0;
//        String wadah = "";
//        long res=0;
//        for (int i=0; i<n;i++){
//            if (s.length()<n) {
//                wadah += s;
//            }
//            else break;
//        }
//        wadah = wadah.substring(0, (int)n);
//        for (int i=0; i< wadah.length();i++){
//            if (wadah.charAt(i)=='a') res++;
//
//        }
//        System.out.println(wadah);
        int cek = 0;// cek ada berapa a pada string awal
        if (s.contains("a")) {
            for (int i=0; i<s.length();i++){
                if(s.charAt(i)=='a') cek++;
            }
        } else res = 0;

        res = cek * (n/s.length());
        long mod = n%s.length();
        if (mod!=0) {
            for(int i=0; i<mod;i++){
                if(s.charAt(i)=='a') res++;
            }
        } else System.out.println(res);
        System.out.println(res);
    }
}
