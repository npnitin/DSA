package com.example.DSA;

public class SCPDemo {

    public static void main(String[] args) {

        String str = new String("Nitin").intern();
        String str2 = new String("Nitin");
        String str3 ="Nitin";
        String str4 ="Nitin";

        System.out.println(str3 == str4);
        System.out.println(str == str3);

        StringBuffer s;
    }
}
