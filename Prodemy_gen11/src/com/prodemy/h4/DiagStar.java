package com.prodemy.h4;

public class DiagStar {
    public static void main(String[] args) {
        int n=9;
        for (int i = 0; i< n;i++) { //block inisialisasi; block kondisi; increment
            for (int j = 0; j < n; j++) {
                if (j==i) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        // diagonal lain
        for (int i = n; i>0;--i) { //block inisialisasi; block kondisi; increment
            for (int j = 0; j < n; j++) {
                if (j==i) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        // cara lain
        for (int i = 0; i< n;i++) { //block inisialisasi; block kondisi; increment
            for (int j = n; j > 0 ; j--) {
                if (j==i) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
