package com.example.interthread;

import java.util.Queue;

public class Producer extends  Thread{

    Queue sharedQ;
    public  Producer(Queue sharedQ){
        this.sharedQ = sharedQ;
    }
    public void run(){
        while(true){
            synchronized (sharedQ){
                while(sharedQ.size()==1){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Produced 1"+ sharedQ.add(1));
                sharedQ.notify();
            }
        }

    }
}
