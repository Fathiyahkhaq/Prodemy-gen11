package com.prodemy.h6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HitungVokal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();
        kalimat = kalimat.toLowerCase();
        ArrayList<String> word = new ArrayList();
        for (String i: kalimat.split("")){
            word.add(i);
        }
        System.out.println(word);

        HashSet<String> vocal = new HashSet();
        vocal.add("a");
        vocal.add("i");
        vocal.add("u");
        vocal.add("e");
        vocal.add("o");

        HashSet<String> vokal2 = new HashSet();

        int jumlah = 0;
        for (String j: vocal){
            if(word.contains(j)) {
                vokal2.add(j);
                jumlah+=1;
            }
        }
        System.out.println(vokal2);
        System.out.println(jumlah);


    }
}
