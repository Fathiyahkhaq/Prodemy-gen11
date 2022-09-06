package com.prodemy.h2;

import com.prodemy.util.DateUtil;

public class LogikaProgram {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x>3 || x<4); // or
        System.out.println(x>3 && x<4); // and
        System.out.println(!(x>3 && x<4)); // reverse
        //if
        if(20>18) {
            System.out.println("20 lebih dari 18");
        }
        int y = 18;
        //if-else
        if (x < y) {
            System.out.println(x+" kurang dari "+y);
        }
        else {
            System.out.println(x+" lebih dari samdeng "+y);
        }
        // if-else statement bentuk lain
        int t = 20;
        String res = (t<18)? "Good day": "Goodtime";
        System.out.println(res);

        String infohari = DateUtil.getInfoHari();
        System.out.println(infohari);

    }
}
