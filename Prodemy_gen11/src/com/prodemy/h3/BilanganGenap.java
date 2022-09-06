package com.prodemy.h3;

import java.util.Scanner;

public class BilanganGenap {
//  public static int getCount(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Bilangan genap yang dibutuhkan: ");
//        int bil = in.nextInt();
//        return bil;
//    }

    public static void main(String[] args){
        int i = 1;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Bilangan genap pertama yang dibutuhkan: ");
        int bil = in.nextInt();
        while (count<bil){
            if(i % 2 != 1) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
