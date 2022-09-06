package com.prodemy.h3;

import com.prodemy.util.DateUtil;

import java.time.LocalDateTime;

public class BilanganGanjil {
    //menampilkan 10 bilangan ganjil pertama
    public static int getCount(){
        return 10;
    }
    public static void main(String[] args){
        int i = 0;
        int count = 0;
        do{
            if(i % 2 != 0){
                System.out.println(i);
                count++;
            }
            i++;
        } while (count<getCount());

        String infohari = DateUtil.getInfoHari();
        System.out.println(infohari);
    }
}
