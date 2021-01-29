package com.example.DSA;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainDriver {


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        TestDemo1 test = new TestDemo1();
        test.setX(10);
        test.setY(12);
        ExecutorService service = Executors.newFixedThreadPool(1);
        System.out.println(service.submit(test).get());
        service.shutdown();
    }
}
