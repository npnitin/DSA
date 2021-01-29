package com.example.DSA;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 extends Thread {

    static class MyKey{
        private String val;
        MyKey(String val){
            this.val=val;
        }

        MyKey(){

        }
        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        (new Test1()).start();

        Long l = new Long(20);
        Long l1 = new Long(20);
        System.out.println(l.equals(l1));
        System.out.println(l==l1);

        MyKey key = new MyKey();
        key.setVal("Pankaj");
        Map<MyKey,String> map = new HashMap<>();
        map.put(key,"val");
        key.setVal("Amit");
        System.out.println(map.get(new MyKey("Pankaj")));

        ExecutorService n= Executors.newFixedThreadPool(10);


        List<Long> numbers = new ArrayList<Long>();
        numbers.add(new Long(1));

        String str = "Hello my name is nitin.";
        String str1 = str.substring(6,8);
        System.out.println(str1);

        System.out.println(Optional.ofNullable(key));

        int x;


    }
}
