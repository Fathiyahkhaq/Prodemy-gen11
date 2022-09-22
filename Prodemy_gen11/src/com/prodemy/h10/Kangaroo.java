package com.prodemy.h10;

public class Kangaroo {
    public static void main(String[] args) {
        int x1=2, v1 = 1, x2 = 1, v2 = 2;

        String ans = "NO";
        for (int i=0;i<10000;i++){
            x1+=v1;
            x2+=v2;
            if (x1==x2) {
                ans = "YES";
                break;
            }
        }
        System.out.println(ans);
    }
}
