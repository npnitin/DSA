package com.example.tree;

public class Test {

    public static void main(String[] args) {
        Tree tree= new Tree();
        tree.insert(10);
        tree.insert(12);
        tree.insert(4);
        tree.insert(7);
        tree.insert(25);
        tree.insert(2);
        tree.insert(15);

        /*System.out.print("Recursive Inorder:");
        tree.inorderRec(tree.getRoot());
        System.out.println();
        System.out.print("Recursive Preorder:");
        tree.preorderRec(tree.getRoot());
        System.out.println();
        System.out.print("Recursive Postorder:");
        tree.postorderRec(tree.getRoot());
        System.out.println();
        System.out.println("Inorder Iterative");
        tree.inorderIterative(tre   e.getRoot());*/
       // tree.printLevelwise(tree.getRoot());
        System.out.println(tree.size(tree.getRoot()));
    }
}
