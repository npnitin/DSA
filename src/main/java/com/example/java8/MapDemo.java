package com.example.java8;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<User,String> users = new HashMap<>();
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");
        users.put(new User(1,"nitin",50,"A"),"nitin");

        System.out.println(users);

    }
}
