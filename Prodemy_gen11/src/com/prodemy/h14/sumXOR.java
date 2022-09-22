package com.prodemy.h14;

public class sumXOR {
    public static void main(String[] args) {
        long n=4;
        long res = 0;
//        for (long i = 0; i<n;i++){
//            if((n^i)==n+i) res++;
//        }
        System.out.println(res);
        String s = Long.toBinaryString(n);
        System.out.println(s);
        System.out.println((long) Math.pow(2,4));
        System.out.println(Long.parseLong(s,2));
    }
}
