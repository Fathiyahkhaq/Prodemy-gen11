package com.prodemy.h9;

public class SquareInt {
    public static void main(String[] args) {
        int res = 0,a=3,b=9, wadah = 0;
//        double k=0;
//        int j = 0;
//        for (double i=a;i<=b;i++){
//            k =  Math.sqrt(i);
//            j = (int) k;
//            if (k-j==0) res++;
//            else wadah++;
//            System.out.println(k);
//            k = Math.round(k);
//            System.out.println(k);
//        }
        System.out.println(res);
        System.out.println(wadah);

        int k =(int) Math.sqrt(a);
        int j =(int) Math.sqrt(b);
        for (int i=k;i<=j;i++){
            if (i*i>=a && i*i<=b) res++;
        }
        System.out.println(res);
    }
}
