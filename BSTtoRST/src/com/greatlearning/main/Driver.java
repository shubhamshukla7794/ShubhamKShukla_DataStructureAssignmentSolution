package com.greatlearning.main;

import com.greatlearning.model.BinarySearchTree;
import com.greatlearning.model.Node;

public class Driver {

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.setRoot(new Node(50));
        tree.getRoot().setLeft(new Node(30));
        tree.getRoot().setRight(new Node(60));
        tree.getRoot().getLeft().setLeft(new Node(10));
        tree.getRoot().getRight().setLeft(new Node(55));

//        System.out.println("Tree");
        tree.convertToRST(tree.getRoot());
        tree.print(tree.getSkewRoot());
    }

}
