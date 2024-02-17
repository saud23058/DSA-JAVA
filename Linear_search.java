package Linear_Search;

public class Linear_search {
    public static void main(String[] args) {
        int []array={2,5,7,2,8,0,6,};
        int num=8;
        int index=linearSearch(array,num);
        if(index!=-1){
            System.out.println(num+" is found at :"+index);
        }else{
            System.out.println("Number is not found");
        }
    }

    public static int linearSearch(int []array, int value){
        for(int i=0; i<array.length; i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
}
//****************************************Linear_Search************************************************** */
/* 
Linear Search = Iterate through collection one element at Time
                Time Complixty is O(n)
                
                
Advantages    =No need to Sorting 
               Fast for searches if the data is small
               Useful for data that do not have random access(Linked List)
Disadvantages = Time increases if data increases (Proportionaly)


//****************************************Linear_Search************************************************** */
               
