public class StaticArray{

    public void insertEnd(int [] arr, int capacity, int element, int length){
        if (length < capacity){
            arr[length] = element;
        }
    }
    public void removeEnd(int [] arr, int length){
        if (length > 0){
            arr[length - 1] = 0;
            length--;
        }
    }
    public void insertMiddle(int [] arr, int index, int element, int length){
        for (int i = length-1; i>=index;i--){
            arr[i+1] = arr[i];
        }
        arr[index] = element;
    }

    public void removeMiddle(int [] arr, int index, int length){
        for (int i = index + 1; i < length; i++){
            arr[i-1] = arr[i];
        }
    }
}