package com.example.Thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchFileReader extends Thread {
    private CountDownLatch countDownLatch;
    private String file;
    CountDownLatchFileReader(CountDownLatch countDownLatch,String file){
        this.countDownLatch=countDownLatch;
        this.file=file;
    }

    @Override
    public void run() {
        System.out.println("reading form file:"+this.file);
        this.countDownLatch.countDown();
    }
}
