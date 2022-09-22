package com.prodemy.h12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakingAnagram {
    public static void main(String[] args) {
        int delete = 0;
        int sama = 0;
        String s1 = "absdjkvuahdakejfnfauhdsaavasdlkj", s2 = "djfladfhiawasdkjvalskufhafablsdkashlahdfa";
        List<Character> ana1 = new ArrayList<>();
        List<Character> ana2 = new ArrayList<>();
        for (char i:s1.toCharArray()){
            ana1.add(i);
        }
        for (char i:s2.toCharArray()){
            ana2.add(i);
        }
        Collections.sort(ana1);
        Collections.sort(ana2);

        for(int i = 0;i<ana1.size();i++){
            for (int j = 0;j<ana2.size();j++){
                if (ana1.get(i)==ana2.get(j)) {
                    sama++;
                    ana2.set(j,' ');
                    break;
                }
            }
        }
        delete = s1.length()+s2.length()-(2*sama);
        System.out.println(sama);
        System.out.println(ana1);
        System.out.println(ana2);
        System.out.println(delete);
    }
}
