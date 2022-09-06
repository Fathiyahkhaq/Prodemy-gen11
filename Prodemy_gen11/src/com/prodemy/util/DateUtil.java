package com.prodemy.util;

import java.time.LocalDateTime;

public class DateUtil {

    static private String[] hari = new String[]
            {"Minggu","senin","Selasa","Rabu","Kamis","Jumat","Sabtu"};
    static private String[] bulan = new String[]
            {"Jan", "Feb","Mar", "apr", "May", "Jun", "Jul"
                    ,"Aug", "Sep", "Oct", "Nov", "Des"};
    public static String getInfoHari(){
        LocalDateTime harini = LocalDateTime.now();
        String infoHari =
                hari[harini.getDayOfWeek().getValue()]+", "
                        + harini.getDayOfMonth() +" "
                        + bulan[harini.getMonthValue()-1] + " "
                        + harini.getYear();
        return infoHari;
    }

}
