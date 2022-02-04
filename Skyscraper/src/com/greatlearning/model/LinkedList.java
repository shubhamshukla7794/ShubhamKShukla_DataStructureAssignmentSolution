package com.greatlearning.model;

public class LinkedList {

    Node head = null;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(int day, int floor) {

        Node newNode = new Node(day, floor);
        newNode.nextNode = head;
        head = newNode;
    }
// FOR SIMPLE PRINTING OF THE LINKED LIST - USED FOR CHECKING PURPOSE ONLY
//    public void printList(Node front) {
//        Node temp = front;
//        while (temp != null) {
//            System.out.println("Day :  " + temp.day + "\t Floor :  " + temp.floor);
//            temp = temp.nextNode;
//        }
//    }


//    MergeSort on LinkedList
    Node sortedMerge(Node left, Node right) {

        Node result;

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        if (left.floor > right.floor) {
            result = left;
            result.nextNode = sortedMerge(left.nextNode, right);
        } else {
            result = right;
            result.nextNode = sortedMerge(left, right.nextNode);
        }

        return result;
    }

    public Node mergeSort(Node source) {

        if (source == null || source.nextNode == null) {
            return source;
        }

        Node middle = getMiddle(source);
        Node nextOfMiddle = middle.nextNode;

        middle.nextNode = null;

        Node left = mergeSort(source);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    public Node getMiddle(Node head) {

        if (head == null) {
            return head;
        }

        Node slow = head, fast = head;

        while (fast.nextNode != null && fast.nextNode.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }

        return slow;
    }

}
