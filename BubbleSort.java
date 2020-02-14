public class BubbleSort implements Practice03Sort {

    public void swap(int [] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public void sort(int[] arr) {

        int passes = 1;
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i = 0; i < arr.length - passes; i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            passes += 1;
        }

    }
}
