package com.prodemy.h12;

import java.util.ArrayList;
import java.util.List;

public class SplitBill {
    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        int k = 1,b=12;
        int sum =0;
        int bayar = 0;
        for (int i=0;i<bill.size();i++){
            if (i!=k) sum+=bill.get(i);
        }
        bayar = b-(sum/2);
        if (bayar==0) System.out.println("Bon Appetit");
        else System.out.println(bayar);
    }
}
