package com.prodemy.test;

public class Fathiyah1H {
    public static void main(String[] args) {
        /*
        Objektif:
        Mengetahui berapa banyak cokelat yang dapat dibeli Bobby dengan uang n=15.
        Harga coklatnya adalah c=3 dimana terdapat promosi dapat menukar 1 coklat dengan m=2 bungkus coklat.
        */
        int n = 2, c = 2,m = 1;
        int res,sisa,wrap;
        res = n/c;//1
        sisa = n%c;//0
        wrap = res+sisa;//1
        while(wrap/m>0){//1/1>0
            res+=wrap/m;//3
            sisa = wrap%m;//0
            wrap=wrap/m+sisa;//1
        }
        System.out.println("Banyak coklat yang bisa dibeli Bobby: "+res);
//        System.out.println(wrap);
    }
}
