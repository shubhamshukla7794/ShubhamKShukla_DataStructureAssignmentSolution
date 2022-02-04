package com.greatlearning.model;

public class Node {
    int day;
    int floor;
    Node nextNode;

    public Node(int day, int floor) {
        this.day = day;
        this.floor = floor;
    }

    public int getDay() {
        return day;
    }

    public int getFloor() {
        return floor;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
