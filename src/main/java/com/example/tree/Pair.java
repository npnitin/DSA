package com.example.tree;

public class Pair {

    Node node;
    int count;

    public Pair(Node node, int count) {
        this.node = node;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Node getNode() {
        return node;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
