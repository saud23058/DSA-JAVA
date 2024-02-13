package LinkedList;

import java.util.LinkedList;

public class LinkList {
public static void main(String[] args) {
   LinkedList<String> linkedList=new LinkedList<>();
   
  // *******************************************************
  // LinkedList =  Nodes are in 2 parts (data + address)
  //                        Nodes are in non-consecutive memory locations
  //                        Elements are linked using pointers
            
  //    advantages?
  //    1. Dynamic Data Structure (allocates needed memory while running)
  //    2. Insertion and Deletion of Nodes is easy. O(1) 
  //    3. No/Low memory waste
  
  //    disadvantages?
  //    1. Greater memory usage (additional pointer)
  //    2. No random access of elements (no index [i])
  //    3. Accessing/searching elements is more time consuming. O(n)
  
  //    uses?
  //    1. implement Stacks/Queues
  //    2. GPS navigation
  //    3. music playlist
  // *******************************************************


  
/* linkedList.push("A");
   linkedList.push("B");
   linkedList.push("C");
   linkedList.push("D");
   linkedList.push("F");
   System.out.println(linkedList);
    This method will print the all elements From "F" to "A"
    for removing the first element we will use "linklist.pop()"
*/ 
   linkedList.offer("A");
   linkedList.offer("B");
   linkedList.offer("C");
   linkedList.offer("D");
   linkedList.offer("F");

   //for removing the Head we will use "linklist.poll()"

   //for inserting an element 
   linkedList.add(4,"E");

   //for deleting an element
   linkedList.remove("E");
   // we can also put only the index of the element that you want to delete

   System.out.println(linkedList.indexOf("B"));
   // Searching an element simply put the index

   System.out.println(linkedList.peekFirst());
   //it will display the first Element

   System.out.println(linkedList.peekLast());
   //it will display the last Element

   linkedList.addFirst("Y");
   //adding the element in the first place or Head

   linkedList.addLast("Z");
   //adding the element in the last place or Tail

   /*
    we can remove first and last element by using 
    linkedlist.removeFirst() and removeLast()
    */



   System.out.println(linkedList);
   




   

}
}
