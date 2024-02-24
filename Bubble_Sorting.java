package Sorting;

public class Bubble_Sorting {
    public static void main(String[] args) {
        int array[]={1,3,2,4,5,3,6,5,7,9,8,0,};
        bubbleSorting(array);
        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void bubbleSorting(int array[]) {
     for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length-i-1; j++) {
            if(array[j]>array[j+1]){
                int temp= array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
     }
        
    }
}
//****************************************Bubble_sort************************************************** */
/*
    Bubble Sorting = pairs of adjcent elements are compared, and the elements
                    swapped if they not i order


                    Time Compexity = Quadratic time O(n^2)
                    small data set = okay
                    large data set = BAD

 *///****************************************Bubble_sort************************************************** */
