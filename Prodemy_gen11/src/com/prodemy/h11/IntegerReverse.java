package com.prodemy.h11;

public class IntegerReverse {
    public static void main(String[] args) {
        String s;
        String rev = "";
        int i = 20, j=23, k=6;
        int day=0;
        for (int h = i;h<=j;h++){
            s = String.valueOf(h);
            for (int l = s.length()-1;l>=0;l--){
                rev += s.charAt(l);
            }
            int resultRev = Integer.parseInt(rev);
            if(Math.abs(resultRev-h)%k==0) day++;
            rev = "";
        }
        System.out.println(day);
    }
}
