package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueeuesLinkedList {
    public static void main(String[] args) {
        Queue<String>queue= new LinkedList<>();
        /*i used linkedlist because the Queue is interface and we cannot make the Instance of Queue
        we can also use another class instead of LinkedList like PriorityQueue These two we can use
        Queue ---> FIFO----> first-in-first-out
        Queue has two Methods
        add--- enqueue , offer(),
        remove--- dequeu, poll(),
        elements but this can through Exception according Documentry
        Queue is Also extends the Collection so queue can access all properties of Collection
        
        offer()-- adding elements in Tail
        poll()-- removing elements from Head

        Queue is Linear Data Structure 
        */
        
        queue.offer("Asad");
        queue.offer("Usman");
        queue.offer("Ali");
        queue.offer("Saud");

        System.out.println(queue.peek());
        /*n Java's Queue class, the peek() method is used to retrieve,
         but not remove, the element at the top of the Queue. 
         It returns the top element without removing it from the Queue. */


        // System.out.println(queue.isEmpty()); return false becz there is an data in this queue


        queue.poll();
        // poll() will remove the head of queue
        System.out.println(queue.size());
        //showing the Size  of Queue
        System.out.println(queue.contains("Asad"));
        // it will give the false becz we removed the Asad using poll(). contains("....") is like searching


        
    }
}
