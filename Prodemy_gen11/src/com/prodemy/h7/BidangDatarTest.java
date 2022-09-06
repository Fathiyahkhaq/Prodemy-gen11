package com.prodemy.h7;

import java.util.ArrayList;
import java.util.List;

public class BidangDatarTest {
    public static void main(String[] args) {
        BidangDatar bd1 = new Persegi(5);

        System.out.println(bd1);

        List<BidangDatar> list = new ArrayList<>();
        list.add(bd1);

        for (BidangDatar bd: list){
            System.out.println(bd);
        }
    }
}
