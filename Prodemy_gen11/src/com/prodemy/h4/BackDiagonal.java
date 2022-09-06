package com.prodemy.h4;

public class BackDiagonal {
    public static void main(String[] args) {
        int n=9;
        for (int i = 0; i< n;i++) { //block inisialisasi; block kondisi; increment
            for (int j = 0; j < n; j++) {
                if (j==n-i-1 || j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
