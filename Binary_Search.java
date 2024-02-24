package Binary_Search;
import java.util.Arrays;

public class Binary_Search {
public static void Predefined(int array[],int target){
    int index= Arrays.binarySearch(array,target);
    if(index ==-1){
        System.out.println("Target is not found");
    }
    else{
        System.out.println(target+" fount at :"+index);
    }
}

public static int binarySearch(int array[],int target){
    int low=0;
    int high=array.length-1;
    while(low<=high){
        int middle=low+(high-low)/2;
        int value=array[middle];

        if(value<target) low=middle-1;
        else if(value>target) high=middle+1;
        else return middle; 
    }
    return -1;
}
    public static void main(String[] args) {
        int []array=new int[100];
        for(int i=0; i<array.length;i++){
            array[i]=i;
        }
        int target=42;
      //  Predefined(array,target);
        //our own Binary Search Method
         int index =binarySearch(array, target);
         if(index ==-1){
            System.out.println("Target is not found");
        }
        else{
            System.out.println(target+" fount at :"+index);
        }
    }


}


//****************************************Binary_Search************************************************** */
/*
 binary Search = Search algorithm that finds the position
                 of a target value with in a sorted array.
                 HAlf of the array is elimu=inated during each "step" */

                 
//****************************************Binary_Search************************************************** */