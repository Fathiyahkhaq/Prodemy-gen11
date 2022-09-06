package com.prodemy.h4;

import com.prodemy.util.Padding;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PolaTriboMirror {
    // menampilkan bilangan tribonacci bentuk plus mirror
    public static void main(String[] args) {
        //user input
        boolean check = false; //deklarasi variable check isinya false
        int n = 0;

        while(!check) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Masukkan angka ganjil lebih dari 2: ");
                n = sc.nextInt();
                check = true;
            } catch (InputMismatchException ime){ //kalau gatau nama errornya bisa pake Exception aja
                System.out.println("Harus integer");
            } catch (Exception e) {
                System.out.println(e);
            } finally { //error atau tidak akan ttp run
                System.out.println("Finally");
            }
        }

        int[] val = new int[n];
        // 3 suku pertama adalah 1
        for (int i = 0; i<3;i++) val[i]=1;
        // sisa suku lainnya
        for (int i = 2; i<n-1;i++){
            val[i+1] = val[i-2]+val[i-1]+val[i];
        }
        for (int i = (n/2)+1; i<n; i++) { //ketika n=9 start dari 5, increment
            for (int j = (n/2)-1; j>=0; j--) { //ketika n=9 start dari 3, decrement
                if (i+j == n-1) val[i] = val[j]; //ketika n=9, i+j = 8
            }
        }
        System.out.println("Tribonacci suku ke "+n+" pertama:" + Arrays.toString(val));
        //bentuk plus
        for (int i = 0; i<n;i++) {
            for(int j = 0; j<n; j++) {
                if(j==n/2) {
                    System.out.print(Padding.pad(val[i]+" ", 3));
                } else if (i==n/2){
                    System.out.print(Padding.pad(val[j]+" ", 3));
                } else {
                    System.out.print(Padding.pad(" ",3));
                }
            }
            System.out.println();
        }
    }
}
