package com.example.interthread;

import java.util.Queue;

public class Consumer extends Thread {

    private Queue sharedQ;

    public Consumer(Queue sharedQ){
        this.sharedQ=sharedQ;
    }

    @Override
    public void run() {
        while(true){
            synchronized (sharedQ){
                while(sharedQ.isEmpty()){
                    try {
                        sharedQ.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("consumed"+sharedQ.remove());
                sharedQ.notify();
            }
        }

    }
}
