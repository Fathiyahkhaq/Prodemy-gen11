package com.prodemy.h4;

import com.prodemy.util.Padding;

import java.util.Arrays;

public class PolaTribonacci {
    public static void main(String[] args) {
        int n=11;
        int[] val = new int[n];
        // 3 suku pertama adalah 1
        for (int i = 0; i<3;i++) val[i]=1;
        // sisa suku lainnya
        for (int i = 2; i<n-1;i++){
            val[i+1] = val[i-2]+val[i-1]+val[i];
        }
        System.out.println("Tribonacci suku ke "+n+" pertama:" +Arrays.toString(val));
        //bentuk plus
        for (int i = 0; i<n;i++) {
            for(int j = 0; j<n; j++) {
                if(j==n/2) {
                    System.out.print(Padding.pad(val[i]+" ", 3));
                } else if (i==n/2){
                    System.out.print(Padding.pad(val[j]+" ", 3));
                } else {
                    System.out.print(Padding.pad(" ",3));
                }
            }
            System.out.println();
        }
    }
}
