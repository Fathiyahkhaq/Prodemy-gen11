package com.prodemy.h8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMultidimensi {
    public static void main(String[] args) {
//        List<List<Integer>> arr = new ArrayList<ArrayList<Integer>>() {{1,2,3},{3,4,5},{5,6,7}};
//        test.get(0).add(1);
//        test.get(1).add(2);
//        test.get(2).add(3);
//        System.out.println(test);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<Integer>(Arrays.asList(11, 2, 4)));
        arr.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        arr.add(new ArrayList<Integer>(Arrays.asList(10, 8, -12)));
        int year = 2012;
        int month = 12;
        int day = 28;
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.getDayOfWeek().toString());
    }
}
