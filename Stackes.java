package Stacks;

import java.util.Stack;

public class Stackes {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<>();

        //push() is used for to add elements in stack
        stack.push("Assassins Creed Mirage");
        stack.push("Assassins Brotherhood");
        stack.push("Assassins Vahala");
        stack.push("Call of duty ");
  
        String game= stack.pop();
        System.out.println("My favourite Game ="+game);
        // poo() remove the values from the top

        System.out.println(stack.search("Assassins Vahala"));
        //if the object is found then it will give the number that where is kept otherwise it will return -1


        System.out.println(stack.peek());
        /*n Java's Stack class, the peek() method is used to retrieve,
         but not remove, the element at the top of the stack. 
         It returns the top element without removing it from the stack. */


        System.out.println("Checking Stack ="+stack.empty()); 
        //checking that stack is empty or not
    }
}
