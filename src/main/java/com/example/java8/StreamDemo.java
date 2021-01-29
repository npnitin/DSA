package com.example.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<User> users= new ArrayList<>();
        User nitin = new User(1,"Nitin",90,"A");
        User sagar = new User(1,"Sagar",40,"C");
        User amol = new User(1,"Amol",92,"A");
        User sachin = new User(1,"Amol",60,"B");
        users.add(nitin);users.add(sachin);users.add(sagar);users.add(amol);
        StreamDemo streamDemo = new StreamDemo();
        streamDemo.sort(users);
    }

    public void sort(List<User> users){
        List<User> usersList = users.stream().sorted(Comparator.comparingDouble(User::getMarks).reversed()).collect(Collectors.toList());
        System.out.println("Sorted with marks in descending:"+usersList);
        usersList = users.stream().sorted(Comparator.comparing(User::getName).thenComparing(User::getMarks)).collect(Collectors.toList());
        System.out.println(usersList);
    }
}
