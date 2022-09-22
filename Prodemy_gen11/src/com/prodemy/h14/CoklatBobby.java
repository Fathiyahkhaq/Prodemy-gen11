package com.prodemy.h14;

public class CoklatBobby {
    public static void main(String[] args) {
        int n = 15, c = 3,m = 2;
        int res,sisa,wrap;
        res = n/c;
        sisa = n%c;
        wrap = res+sisa;
        while(wrap/m>0){
            res+=wrap/m;
            sisa = wrap%m;
            wrap=wrap/m+sisa;
        }
        System.out.println("Banyak coklat yang bisa dibeli Bobby: "+res);
    }
}
