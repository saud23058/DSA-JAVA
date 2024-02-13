package Queues;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesPriority {
    public static void main(String[] args) {
        Queue<Double>queue=new PriorityQueue<>();
        /*
          As we know that the Queue is Interface so we can not make Instance of Queue
          thats why i used PriorityQueue()
          FIFI---------first-in-first-out
          and there functionality(methods) is like Linkedlist
          
          PriorityQueue that is use for "That give high priority element first before the elements whoes priority is low"
         */
        queue.offer(3.0);
        queue.offer(4.0);
        queue.offer(2.5);
        queue.offer(1.0);
        //it will show all elemets in Ascending order

        System.out.println(queue);
       // PriorityQueue<>(Collections.reverseOrder()) it wil display the result in Desending order
        
    }
}
