package com.example.Thread;

import java.util.concurrent.CountDownLatch;

public class TestCountDown {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        CountDownLatchFileReader file1 =  new CountDownLatchFileReader(countDownLatch,"file1");
        CountDownLatchFileReader file2 = new CountDownLatchFileReader(countDownLatch,"file2");
        file1.start();
        file2.start();

        countDownLatch.await();
        System.out.println("Completed file operations");
    }
}
