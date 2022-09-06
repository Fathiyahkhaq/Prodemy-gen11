package com.prodemy.h6;

import java.util.*;

public class ArrayListContoh {
    public static void main(String args[]){
        List<Integer> a = new ArrayList<>();
        System.out.println(a.isEmpty());
        a.add(1);
        a.add(2);

//
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("Mazda");
//        System.out.println(cars.get(0));
//        System.out.println(cars);
//        cars.set(0,"Hyundai");
//        System.out.println(cars);
//        cars.remove(0);
//        System.out.println(cars);
//        cars.clear();
//        System.out.println(cars);
//        cars.add("Toyota");
//        cars.add("Ayla");
//        System.out.println(cars.size());
//
//        for(String str:cars){
//            System.out.println(str);
//        }
//        Collections.sort(cars);
//        System.out.println(cars);
//        int pos = cars.indexOf("Toyota"); //cari index dengan nama elemen Toyota
//        System.out.println(pos);
//        String str = cars.get(0); //mengambil nama elemen dengan index tertentu
//        System.out.println(str);
//        System.out.println(cars.contains("Hyundai")); //mengetahui ada elemen tertentu atau tidak
//        Collections.sort(cars,Collections.reverseOrder());
//        System.out.println(cars);
//
//        //coba duplikat
//        cars.add("toyota");
//        cars.add(null);
//        cars.add(null);
//        System.out.println(cars);
//
//        //LinkedList
//        LinkedList<String> atk = new LinkedList<String>();
//        atk.add("pen");
//        atk.add("pencil");
//        atk.addFirst("eraser");
//        atk.addLast("ruler");
//        atk.add(2, "pensil case");
//
//        Iterator<String> iterator = atk.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        atk.removeFirst();
//        atk.removeLast();
//        atk.remove(2);
//        Iterator<String> iter2 = atk.iterator();
//        while(iter2.hasNext()){
//            System.out.print(iter2.next()+" ");
//        }
//        System.out.println();
//        Object a = atk.clone();
//        System.out.println("copy atk: "+a);
//        System.out.println(atk.getFirst());
//        System.out.println(atk.getLast());
//        System.out.println(atk.poll());
//        System.out.println("after poll: "+atk);
//
//        atk.add("Ballpoint");
//        atk.add("tip-ex");
//        System.out.println(atk.subList(0,2));
    }
}
