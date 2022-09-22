package com.prodemy.h9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MigrasiBurung {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        Collections.sort(arr);
//        List<Integer> count = new ArrayList<>();
//        List<Integer> cum = new ArrayList<>();
//        int sum = 0;
//        for (int i=0; i<arr.size()-1;i++){
//            if(arr.get(i+1)==arr.get(i)) sum++;
//            count.add(arr.get(i));
//            cum.add(sum);
//        }
        HashMap<Integer,Integer> count = new HashMap<>();
        int sum = 1;
        for (int i=1; i<arr.size();i++){
            if(arr.get(i-1)==arr.get(i)){
                sum++;
                count.put(arr.get(i),sum);
            } else {
                sum = 1;
                count.put(arr.get(i),sum);
            }
        }
        int maxVal = Collections.max(count.values());
        List<Integer> key = new ArrayList<>(count.keySet());
        List<Integer> val = new ArrayList<>(count.values());
        System.out.println(key);
        System.out.println(val);
        int indexMax = val.indexOf(maxVal);
        System.out.println("indexMax: "+indexMax);
        System.out.println("maxval = "+maxVal);
        System.out.println();
        System.out.println(key.get(indexMax));
//        return sum;
//        System.out.println(count);
//        System.out.println(cum);
//        System.out.println(sum);
    }
}
