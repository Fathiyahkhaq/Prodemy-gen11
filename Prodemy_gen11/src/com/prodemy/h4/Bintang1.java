package com.prodemy.h4;

import java.util.ArrayList;
import java.util.List;

public class Bintang1 {
    public static void main(String[] args) {
        int n=9;
        for (int i = 0; i< n;i++) { //block inisialisasi; block kondisi; increment
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int arr[] =  {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i< n;i++) { //block inisialisasi; block kondisi; increment
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}
