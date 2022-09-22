package com.prodemy.h12;

public class HaloweenSale {
    public static void main(String[] args) {
        int s = 85, p = 20,d = 3, m = 6;
        int sum = 0;
        while (s>0){
            s-=p;
            p-=d;
            sum++;
            if(p<=m){
                p=m;
                d=0;
            }

        }
        System.out.println(s);
        System.out.println(sum);
        int n = 3/2;
        System.out.println(n);
    }
}
