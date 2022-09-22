package com.prodemy.h12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissNumber {
    public static void main(String[] args) {
        List<Integer> miss = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();
        int[] arr1 = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
        int[] brr1 = {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
        for (Integer i: arr1) arr.add(i);
        for (Integer i: brr1) brr.add(i);

        Set<Integer> wadah = new HashSet<>();

        for (int i=0; i<arr.size();i++){
            for(int j=0;j<brr.size();j++){
                if(brr.get(j)!=arr.get(i)) {
                    wadah.add(brr.get(j));
                    brr.remove(j);
                }
            }
        }
        for (Integer i:wadah){
            miss.add(i);
        }
        System.out.println(miss);
    }
}
