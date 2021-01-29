package com.example.Thread;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        System.out.println(numbers.hashCode());
        System.out.println(System.identityHashCode(numbers));
    }
}
