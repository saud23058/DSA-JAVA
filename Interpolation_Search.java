package Inetrpolation_Search;

public class Interpolation_Search {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,};
        int index=interpolationSearch(array,8);
        if(index!=-1){
            System.out.println("Found at : "+index);
        }else{
            System.out.println("Value is not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
      int low=0;
      int high=array.length-1;
      while (value>=array[low] && value<=array[high] && low<=high) {
        int prob=low+(high-low)*(value - array[low])/(array[high]-array[low]);
        if(value==array[prob]){
            return prob;
        }else if( array[prob]<value){
            low=prob+1;
        }else{
            high=prob-1;
        }
      }
       return -1;
    }
}

//****************************************Interpolation_Search************************************************** */
/*
 Interpolation = Improvement over the binary search used for "uniformay" distributed "guesses" where a value might be based on 
                  calculated Prob results if the prob is incorrect then the search area will narrowed and new prob is claculated

                  Time Complexity = O(log(log n))  average case
                  O(n)  worst case
 *///****************************************Interpolation_Search************************************************** */
