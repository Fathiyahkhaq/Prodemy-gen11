package com.prodemy.h11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MarsExplore {
    public static void main(String[] args) {
        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS\n";
//        for (char c : s.toCharArray()) {
//            System.out.println(c);
//        }
        List<Character> wadah = new ArrayList<>();
        int res = 0;
        for (char i:s.toCharArray()){
            wadah.add(i);
        }
        for (int i=0; i<wadah.size()/3;i++){
            int j = 3*i;
            if (wadah.get(j)!='S') {
                res++;
            }
            if (wadah.get(j+1)!='O') {
                res++;
            }
            if (wadah.get(j+2)!='S') {
                res++;
            }
        }
        System.out.println(res);
        System.out.println(s.length()/3);
    }
}
