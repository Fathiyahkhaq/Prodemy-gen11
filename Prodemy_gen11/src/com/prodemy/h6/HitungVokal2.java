package com.prodemy.h6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class HitungVokal2 {
    static char[] vocals = new char[]{'a','i','u','e','o'};
    static Scanner sc = new Scanner(System.in);
    static Collection<HurufVocal> totalVocal = new ArrayList();
    static ArrayList<Character> cetakVocal = new ArrayList();

    public static void main(String[] args) {
        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();

        for (int i = 0; i < kalimat.length();i++){
            tambah(kalimat.toLowerCase().charAt(i));
        }
        System.out.println(totalVocal);
        System.out.println(cetakVocal);

    }
    public static void tambah(char huruf) {
        //fungsi tambah array Total Vocal, hanya menambahkan huruf vokal saja
        boolean ditemukan = false;
        for (HurufVocal h: totalVocal){ //jika ada huruf vokal lama
            if (h.vocal==huruf) {
                h.jumlah++;
                cetakVocal.add(cetakVocal.indexOf(h.vocal),h.vocal);
                ditemukan=true;
            }
        }

        if(!ditemukan && isVocal(huruf)){ //dijalankan ketika ada vokal baru teridentifikasi
            HurufVocal h = new HurufVocal();
            h.vocal = huruf;
            h.jumlah=1;
            totalVocal.add(h);
            cetakVocal.add(h.vocal);
        }
    }

    static boolean isVocal(char huruf) { //apakah huruf sama dengan elemen TotalValue
        for(char c: vocals) {
            if (huruf==c) return true;
        }
        return false;
    }

    static class HurufVocal{ //deklarasi kelas baru (reference type)
        char vocal;
        int jumlah;

        @Override // override merubah sifat asli dari toString
        public String toString() {
            return vocal + " : " + jumlah ;
        } //override
    }
}
