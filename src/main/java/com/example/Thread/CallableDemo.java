package com.example.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> callable = () ->{
            return 10*10;
        };
        FutureTask<Integer> task = new FutureTask<>(callable);
        Thread thread= new Thread(task);
        thread.start();
        System.out.println(task.get());
    }
}
