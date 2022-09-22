package com.prodemy.h9;

import java.util.HashSet;

public class PasswordLogin {
    public static void main(String[] args) {
        int n = 7;
        String password = "AUzs-nV";
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
//        char[] pass = password.toCharArray();
//        CharSequence numb = new StringBuffer(numbers);
//        CharSequence lower = new StringBuffer(lower_case);
//        CharSequence upper = new StringBuffer(upper_case);
//        CharSequence special = new StringBuffer(special_characters);
//        int digit=0;
        int res=0;
//        int num = 1, low=1, up=1, sp = 1;
//        if (n<=6) {
//            digit = 6-n;
//        }
        if (!password.matches("(.*)[0-9](.*)")) res++;
        if (!password.matches("(.*)[a-z](.*)")) res++;
        if (!password.matches("(.*)[A-Z](.*)")) res++;
        if (!password.matches("(.*)[!@#$%^&*()\\-+](.*)")) res++;

//        System.out.println(digit);
        System.out.println(res);
        int max = Math.max(6-n, res);
        System.out.println(max);
        System.out.println(password.matches("(.*)[!@#$%^&*()\\-+](.*)"));
    }
}
