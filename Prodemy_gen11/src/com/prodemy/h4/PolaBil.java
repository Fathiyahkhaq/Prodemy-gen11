package com.prodemy.h4;

import com.prodemy.util.Padding;

import java.util.Arrays;

public class PolaBil {
    public static void main(String[] args){
        int n=9;
        int[] val;
        val  = new int[n];
        val[0] = 1;
        val[1] = 1;
        // loop fibonacci
        for (int g = 1; g<n-1; g++) {
            val[g+1] = val[g-1]+val[g];
        }
        System.out.println("Barisan Fibbonaci hingga suku ke "+n+" adalah "+Arrays.toString(val));
        for (int i = 0; i< n;i++) { //block inisialisasi; block kondisi; increment
            for (int j = 0; j < n; j++) {
                if (j==i || i+j ==n-1) {
                    System.out.print(Padding.pad(val[j],3));
                } else {
                    System.out.print(Padding.pad(" ", 3));
                }
            }
            System.out.println();
        }
    }
}
