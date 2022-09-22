package com.prodemy.h2;

public class Penambahan {
    public static void main(String[] args) {
        int a = 100 + 50;
        int b = a + 50;
        int c = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int d = 5;
        d >>= 3; // lebih dari samdeng
        System.out.println(d);
        int f = 5;
        f %= 2; //modulo
        System.out.println(f);
        int g = 10;
        g /= 2; //pembagian
        System.out.println(g);
        int h = 2;
        h^=3;
        System.out.println("2^=3 "+h);
        int k = 3;
        k^=5; //penambahan XOR
        System.out.println("3^=5 "+ k);
        int l = 2;
        l = l^2; //bukan pangkat
        System.out.println(l);
        int i = 1;
        System.out.println("i++ "+ i++);
        System.out.println("++i "+ ++i);
        int bil = 9/2;
        System.out.println(bil);
        double val = 9/2;
        System.out.println(val);
//        int val;
//        System.out.println(val);
        String hei = "hello";
        System.out.println(hei.substring(2));
        float nilai = 9.0F;
        int ganti = (int) nilai;
        System.out.println(ganti);

    }
}
