package com.prodemy.util;

public class Padding {
    //buat fungsi padding
    public static String pad(String bil, int panjang) {
        String res = "";
        for (int i = 0; i < panjang; i++){
            res += " ";
        }
        res = res +bil;
        res = res.substring(res.length()-panjang);
        return res;
    }
    public static String pad(int bil, int panjang) {
        String res = "";
        for (int i = 0; i < panjang; i++){
            res += "0";
        }
        res = res +bil;
        res = res.substring(res.length()-panjang);
        return res;
    }
}
