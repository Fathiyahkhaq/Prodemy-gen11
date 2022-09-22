package com.prodemy.h8;

import java.util.ArrayList;
import java.util.List;

public class CaesarChiper {
    public static void main(String[] args) {
        String s = "HelloThere";
        int k=3;
        char[] sArr = s.toCharArray();
        List<Integer> codeAwal = new ArrayList<>();
        for (char m: sArr){
            System.out.println(m+ " = "+(int)m);
        }//convert char ke ascii
        System.out.println(Character.toString((char) 97));//ubah kode ascii ke char

        String ori = "abcdefghijklmnopqrstuvwxyz";
        String wadah = ori.substring(0,k);
        ori = ori.replace(wadah,"");
        System.out.println(ori+wadah);



    }
}
