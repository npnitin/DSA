package com.example.interthread;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {
        Queue sharedQ = new LinkedList();
        Producer producer = new Producer(sharedQ);
        Consumer consumer = new Consumer(sharedQ);
        producer.start();
        consumer.start();
    }
}
