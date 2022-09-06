package com.prodemy.h7;

import java.time.LocalDateTime;
import java.util.Date;

public class Mahasiswa {

    private MyDate tanggalLahir; //encapsulation
    private Date tanggalLahir2;
    private LocalDateTime tanggal;
    public static void main(String[] args) {
       MyDate d = new MyDate();
       d.setDay(30);
       System.out.println(d.getDay());


    }

}
