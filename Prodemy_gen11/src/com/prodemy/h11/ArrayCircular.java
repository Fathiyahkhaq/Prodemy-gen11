package com.prodemy.h11;

import java.util.ArrayList;
import java.util.List;

public class ArrayCircular {
    public static void main(String[] args) {
        int wadah = 0,k=2;
        List<Integer> a = new ArrayList<>();
        List<Integer> q = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        q.add(1);
        q.add(2);
        for(int i=0; i<k;i++) {
            wadah = a.get(a.size()-1);
            a.remove(a.size()-1);
            a.add(0,wadah);
        }

        for (int i = 0; i<q.size();i++){
            res.add(a.get(q.get(i)));
        }
        System.out.println(res);
        System.out.println(a);
    }
}
