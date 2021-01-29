package com.example.racecondition;

public class DataRace {

    public static void main(String[] args) {
        SharedClass shared = new SharedClass();
        Thread t1 = new Thread(()->{
            for(int i=0;i<Integer.MAX_VALUE;i++){
            shared.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=1;i<Integer.MAX_VALUE;i++){
    shared.checkDataRace();
            }
        });

        t1.start();t2.start();
    }
    public static class SharedClass{
        //volatile int x=0,y=0;
        int x=0,y=0;
        public void increment(){
            x++;
            y++;
        }
        public void checkDataRace(){
            if(y>x){
                System.out.println("data race detected");
            }
        }
    }
}
