public class SelectionSort implements Practice03Sort{

    public int findMin(int [] arr, int start){

        int min = start;
        for(int i = start + 1; i < arr.length; i++){
            if(arr[i] < arr[min])
                min = i;
        }
        return min;

    }

    // Finds the smallest value in the 'remainder' list and swaps the values
    public void swap(int [] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public void sort(int [] arr){

        for(int i = 0; i < arr.length - 1; i++){
            swap(arr, i, findMin(arr, i));
        }

    }


}
