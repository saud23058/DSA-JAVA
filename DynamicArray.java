package Dynamic_Array;

public class DynamicArray {
    int size;
    int capacity=10;
    Object [] array;

    public DynamicArray(){
        this.array=new Object[capacity];
    }
    public DynamicArray(int capacity){
        this.capacity=capacity;
        this.array=new Object[capacity];
    }

    public void add(Object data){
       if(size >=capacity){
        grow();
       }
       array[size]=data;
       size++;
    }
    public void insert(int index, Object data){
    if(size>=capacity){
        grow();
    }
    for (int i = size; i > index ; i--) {
        array[i]=array[i-1]; // shifting
    }
    array[index]=data;
    size++;
    }

    public void delete(Object data){ 
        for (int i = 0; i < size; i++) {
            if(array[i]==data){
                for (int j = 0; j < (size-i-1); j++) {
                    array[i+j]=array[i+j+1];
                }
                array[size-1]=null;
                size--;
                if(size<=(int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data){
        for(int i=0; i<size;i++){
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
    private void grow(){

        int newCapcity=(int)(capacity*2);
        Object[]newArray=new Object[newCapcity];
        for (int i = 0; i < size; i++) {
            newArray[i]=array[i];
        }
        capacity=newCapcity;
        array=newArray;
    }
    private void shrink(){
        int newCapcity=(int)(capacity/2);
        Object[]newArray=new Object[newCapcity];
        for (int i = 0; i < size; i++) {
            newArray[i]=array[i];
        }
        capacity=newCapcity;
        array=newArray;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public String toString(){
        String string="";
        for (int i = 0; i < size; i++) { //if we use the capcity instead of size then it will show also the null spaces
            string+=array[i]+", ";
        }
        if(string!=""){
            string="["+string.substring(0,string.length()-2)+"]"; // i used the substring() to get ride of " ," on the last element
        }
        else{
            string="[]";// if the array is empty
        }
        return string;
    }

}

class Main{
    public static void main(String[] args) {
        DynamicArray dynamicArray=new DynamicArray();
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");
        System.out.println(dynamicArray.search("c"));
        dynamicArray.insert(0, "x");
        dynamicArray.delete("a");
        System.out.println("size :"+dynamicArray.size);
        System.out.println("Empty :"+dynamicArray.isEmpty());
        System.out.println("Capacity :"+dynamicArray.capacity);
        System.out.println(dynamicArray);
    }
}
