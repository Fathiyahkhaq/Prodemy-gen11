package com.prodemy.h2; //identifier, bukan perintah

import java.util.Scanner; //import dari folder java.util

public class Halonama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan namamu: ");
        String nama = in.nextLine();
        System.out.printf("Hello, " + nama);
    }
}
