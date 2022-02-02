package com.greatlearning.model;

public class BinarySearchTree {

    Node root;
    Node skewRoot, current;

    public Node getRoot() {
        return root;
    }

    public Node getSkewRoot() {
        return skewRoot;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    //    public Node insertNode(Node root, int data) {
//        if (root == null) {
//            root = new Node(data);
//            return root;
//        }
//
//        if (data < root.key) {
//            root.left = insertNode(root.left, data);
//        } else if (data > root.key) {
//            root.right = insertNode(root.right, data);
//        }
//
//        return root;
//
//    }

    public void convertToRST(Node root) {
        if (root == null) {
            return;
        }

        convertToRST(root.left);
        skew(root.key);
        convertToRST(root.right);
    }

    public void print(Node root) {
        if (root == null) {
            return;
        }

        print(root.left);
        System.out.print(root.key + " ");
        print(root.right);
    }

    public void skew(int data) {
        if (skewRoot == null) {
            skewRoot = new Node(data);
            current = skewRoot;
        }else {
            current.right = new Node(data);
            current = current.right;
        }
    }

}
