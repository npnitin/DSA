package com.example.DSA;

import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.*;

public class Test {

  JdbcTemplate j;
    public static void main(String[] args) {
      Set<String> stringSet = new HashSet<>();
      stringSet.add("abc");
      stringSet.add("abc");
        System.out.println(stringSet.size());


      System.out.println("start");
      List<GarbageCollectorMXBean> gc = ManagementFactory.getGarbageCollectorMXBeans();
      for(GarbageCollectorMXBean g:gc){
        System.out.println(g.getName());
      }
      System.out.println("end");

      Calendar.getInstance();
      NumberFormat.getInstance();
        Set<StringBuffer> stringSet1 = new HashSet<>();
        stringSet1.add(new StringBuffer("abc"));
        stringSet1.add(new StringBuffer("abc"));
        System.out.println(stringSet1.size());

        Set<StringBuilder> stringSet2 = new HashSet<>();
        stringSet2.add(new StringBuilder("abc"));
        stringSet2.add(new StringBuilder("abc"));
        System.out.println(stringSet2.size());

        Integer i= new Integer(127);
        Integer i1=127;

        Integer i2=128;
        Integer i3=128;

        System.out.println(i==i1);
        System.out.println(i2==i3);

        System.out.println(i.equals(i1));
        System.out.println(i2.equals(i3));

        System.out.println(Integer.valueOf(128));

        Set<String> set = new HashSet<>(Arrays.asList("Test","Test1"));
        System.out.println("set"+set.contains("Test"));


        System.out.println(new BigDecimal("290"));

        new LinkedList<String>();
        new ArrayList<String>();

    }
}


