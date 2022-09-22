package com.prodemy.h9;

import com.prodemy.h11.IntegerReverse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GemStone {
    public static void main(String[] args) {
        int res = 0;
        List<String> arr = new ArrayList<>();
        arr.add("abcdde");
        arr.add("baccd");
        arr.add("eeabg");
        System.out.println(arr);
        Set<String> wadah = new HashSet<>();
        System.out.println(arr.get(0).contains("a"));
        for (char i='a';i<='z';i++){
            String huruf = String.valueOf(i);
            for(int j = 0;j<arr.size();j++){
                if(arr.get(j).contains(huruf)) wadah.add(huruf);
                else {
                    wadah.remove(huruf);
                    break;
                }
            }
        }
        System.out.println(wadah);
    }
}
