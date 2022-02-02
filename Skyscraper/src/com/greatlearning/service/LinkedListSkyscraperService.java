package com.greatlearning.service;

import com.greatlearning.model.LinkedList;

import java.util.Scanner;

public class LinkedListSkyscraperService {

    LinkedList linkedList;


    public LinkedListSkyscraperService() {
        this.linkedList = new LinkedList();
    }

    public int setConstructionDetails() {
        Scanner input = new Scanner(System.in);
        int no_of_floors, floor;

        System.out.println("enter the total no of floors in the building");
        no_of_floors = input.nextInt();

        for (int i = 1; i <= no_of_floors; i++) {
            System.out.println("enter the floor size given on day : " + i);
            floor = input.nextInt();
            linkedList.add(i,floor);
        }

        input.close();

        return no_of_floors;
    }

    public void assemblyPlan(int no_of_floors) {
        linkedList.head = linkedList.mergeSort(linkedList.head);
        LinkedList.Node temp = linkedList.head;

        for (int i = 1; i<= no_of_floors; i++) {
            System.out.println("\nDay: " + i);
            if (i == temp.getDay()) {
                System.out.print(temp.getFloor());

                while (temp.getNextNode() != null && temp.getFloor() - temp.getNextNode().getFloor() == 1
                            && temp.getDay() > temp.getNextNode().getDay()) {
                        temp = temp.getNextNode();
                        System.out.print(" " + temp.getFloor());
                    }

                if (temp.getNextNode() != null) {
                    temp = temp.getNextNode();
                }

            }
        }

    }
// FOR SIMPLE PRINTING OF THE LINKED LIST - USED FOR CHECKING PURPOSE ONLY
//    public void printPlan() {
//        linkedList.printList(linkedList.head);
//    }

}
