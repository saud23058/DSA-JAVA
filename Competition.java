package ArrayListVsLinkedList;
import java.util.ArrayList;
import java.util.LinkedList;

public class Competition {
public static void main(String[] args) {
    LinkedList<Integer>linkedList=new LinkedList<>();
    ArrayList<Integer>arrayList=new ArrayList<>();

    long startTime;
    long endTime;
    long elapsedTime;

    for (int i = 0; i < 1000000; i++) {
        linkedList.add(i);
        arrayList.add(i);
    }
    //***************************LinkedList************************************* 
     startTime=System.nanoTime();

     linkedList.get(50000);//Taking first Element and See time it takes

     endTime=System.nanoTime();


     elapsedTime=endTime-startTime;

     System.out.println("LinkedList :\t"+elapsedTime+"ns");

     //***************************ArrayList*************************************
     startTime=System.nanoTime();

     arrayList.get(50000);//Taking first Element and See time it takes

     endTime=System.nanoTime();


     elapsedTime=endTime-startTime;

     System.out.println("ArrayList :\t"+elapsedTime+"ns");
 
//********************************Removing******************************************** 
// in Removing Case The Arraylist Take more time than LinkedList due to shifting 
// but if we remove any element some where in the Middle arraylist takes Less Time
}    
}
