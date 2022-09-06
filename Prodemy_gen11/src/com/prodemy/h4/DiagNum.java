package com.prodemy.h4;

import com.prodemy.util.Padding;

public class DiagNum {
    public static void main(String[] args) {
        // menampilkan bil ganjil bentuk X
        int n = 9;
        for (int i = 0; i < n; i++) { //block inisialisasi; block kondisi; increment
            for (int j = 0; j < n; j++) {
//                if(j % 2 == 1) { //this is wrong logic
                    if(j == i || j == n-i-1) {
                        System.out.print(2*j+1);
                    } else {
                        System.out.print(" ");
                    }
//                }
            }
            System.out.println();
        }

        // jika bilangan dengan array
        int[] val;
        val = new int[n];
        for (int g = 0; g<n; g++) {
            val[g] = (2*g)+1;
        }
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
//    //buat fungsi padding
//    public static String pad(String bil, int panjang) {
//        String res = "";
//        for (int i = 0; i < panjang; i++){
//            res += " ";
//        }
//        res = res +bil;
//        res = res.substring(res.length()-panjang);
//        return res;
//    }
//    public static String pad(int bil, int panjang) {
//        String res = "";
//        for (int i = 0; i < panjang; i++){
//            res += "0";
//        }
//        res = res +bil;
//        res = res.substring(res.length()-panjang);
//        return res;
//    }
}
