package com.greatlearning.main;

import com.greatlearning.service.LinkedListSkyscraperService;
import com.greatlearning.service.StackSkyscraperService;

public class Driver {

    public static void main(String[] args) {

//        Using LinkedList
//        ================
//        LinkedListSkyscraperService service = new LinkedListSkyscraperService();
//        int no_of_floors = service.setConstructionDetails();
//        service.assemblyPlanUsingLinkedList(no_of_floors);


//        Using Stacks
//        ===========
        StackSkyscraperService stackService = new StackSkyscraperService();
        int no_of_floors = stackService.inputFloors();
        stackService.assemblyPlanUsingStacks(no_of_floors);



//        IGNORABLE
//        ---------
//        FOR SIMPLE PRINTING OF THE LINKED LIST - USED FOR CHECKING PURPOSE ONLY
//        LinkedList linkedList = new LinkedList();

//        linkedList.add(1,3);
//        linkedList.add(2,1);
//        linkedList.add(3,2);


//        linkedList.add(1,4);
//        linkedList.add(2,5);
//        linkedList.add(3,1);
//        linkedList.add(4,2);
//        linkedList.add(5,3);

//        linkedList.add(1,1);
//        linkedList.add(2,2);
//        linkedList.add(3,3);
//        linkedList.add(4,8);
//        linkedList.add(5,9);
//        linkedList.add(6,10);
//        linkedList.add(7,4);
//        linkedList.add(8,5);
//        linkedList.add(9,7);
//        linkedList.add(10,6);
//
//        linkedList.head = linkedList.mergeSort(linkedList.head);
//        linkedList.printList(linkedList.head);


// FOR SIMPLE PRINTING OF THE LINKED LIST - USED FOR CHECKING PURPOSE ONLY
//        service.printPlan();

    }

}
