package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(int data){
        Node current = this.root;
        if(this.root == null){
            root = new Node(data);
            return;
        }
        while(true){
            if(data>current.getData()){
                if(current.getRight()!=null){
                    current= current.getRight();
                }else{
                    Node node = new Node(data);
                    current.setRight(node);
                    return;
                }
            }
            if(data<current.getData()){
                if(current.getLeft()!=null){
                    current=current.getLeft();
                }else{
                    Node node = new Node(data);
                    current.setLeft(node);
                    return;
                }
            }
        }
    }
    public void inorderRec(Node root){
        if(root==null){
            return;
        }
        inorderRec(root.getLeft());
        System.out.print(root.getData()+ " ");
        inorderRec(root.getRight());
    }

    public void preorderRec(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.getData()+" ");
        preorderRec(root.getLeft());
        preorderRec(root.getRight());
    }

    public void postorderRec(Node root){
        if(root==null){
            return;
        }
        preorderRec(root.getLeft());
        preorderRec(root.getRight());
        System.out.print(root.getData()+" ");
    }

    public void inorderIterative(Node root){
        Stack<Pair> stack = new Stack();
        stack.push(new Pair(root,1));
        while(!stack.isEmpty()){
            Pair current = stack.peek();
            if(current.getNode().getLeft()!=null && current.getCount()==1){
                stack.push(new Pair(current.getNode().getLeft(),1));
                current.setCount(current.getCount()+1);
                continue;
            }else if(current.getNode().getLeft()==null || (current.getNode().getLeft()!=null && current.getCount()!=0)){
                System.out.print(current.getNode().getData()+" ");
                stack.pop();
                if(current.getNode().getRight()!=null){
                    stack.push(new Pair(current.getNode().getRight(),1));
                }

            }
        }
    }

    public void printLevelwise(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.remove();
            System.out.print(node.getData()+ " ");
            if(node.getLeft()!=null){
                queue.add(node.getLeft());
            }
            if(node.getRight()!=null){
                queue.add(node.getRight());
            }
        }
    }

    public int size(Node root){
        if(root == null) {
            return 0;
        }
            int l= size(root.getLeft());
            int r = size(root.getRight());
            return Math.max(l,r)+1;
    }

}
