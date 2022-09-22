package com.prodemy.h14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumber {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(3);
        a.add(3);
        a.add(1);
        Collections.sort(a);
        int res =0;
        int def = 0;
        for (int i=0; i<a.size()-1;i++){
            res=1;
            for( int j=i+1;j<a.size();j++){
                if (Math.abs(a.get(i)-a.get(j))<=1) {
                    res++;
                }
                def = Math.max(def,res);
            }
        }
        System.out.println(def);
    }
}
