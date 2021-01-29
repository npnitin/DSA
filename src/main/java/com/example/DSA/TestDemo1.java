package com.example.DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class TestDemo1 implements Callable<Integer> {

    List<? super Number> list = new ArrayList<Number>();

    private int result;
    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }


    @Override
    public Integer call() throws Exception {
        return x*y;
    }
}
