public class DynamicArray{
    int capacity;
    int length; 
    int arr[];
    public DynamicArray(){
        capacity = 2;
        length =0;
        arr = new int[2];
    }
    public void insertEnd(int element){
        if(length == capacity){
            resize();
        }
        arr[length] = element;
        length++;
    }

    public void resize(){
        capacity = capacity*2;
        int[] newArr = new int[capacity];
        for (int i = 0; i<arr.length;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;

    }

    public void removeEnd(){
        if(length > 0){
            length--;
        }
    }

    public void insertAt(int index, int element){
        if (index < length){
            arr[index] = element;
        }
    }
}