package com.prodemy.h8;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:45:54PM";
        String format = s.substring(8); //PM/AM
        Integer jam = Integer.valueOf(s.substring(0,2));
        Integer menit = Integer.valueOf(s.substring(3,5));
        Integer detik = Integer.valueOf(s.substring(6,8));
        String waktu = "";
        System.out.println(format);
        if (format.equals("PM")&&jam<12 ){
            jam+=12;
            waktu = jam+s.substring(2,8);
        } else if (format.equals("AM") && jam==12){
            waktu = "00"+s.substring(3,9);
        } else {
            waktu = s.substring(0,8);
        }
//        else if (format.equals("AM") && jam<12){
//            waktu = s.substring(0,8);
//        }
        System.out.println(jam+":"+menit+":"+detik+""+format);
        System.out.println(waktu);
    }
}
