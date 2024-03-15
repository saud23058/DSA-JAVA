public class Insertion_Sorting{
    public static void main(String[] args) {
        int arr[]={2,5,3,6,7,8};
        insertionSorted(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    private static void insertionSorted(int[] arr) {
        for(int i=1 ; i<arr.length; i++){
            int currentValue=arr[i];
            int j=i-1;
            while(j>=0 && currentValue<arr[j]){
               arr[j+1]=arr[j];
               j--;
            }
            arr[j+1]=currentValue;
        }
    }
}

/*
 Insertion sort = After comparing elements to the left
                 shift elementsto the right to make room to insert a value 

                 Quadratic time O(n^2)
                 small data set = decent
                 large data set =BAD

                 Less steps tham Bubble Sort 
                 Best case is O(n) compared to Selection sort O(n^2)
 */