public class BinaryRecursiveSearch implements Practice03Search {

    public int search(int [] arr, int target) {
        int index = binarySearch(arr, target, 0, arr.length - 1);
        return index;
    }

    public int binarySearch(int[] a, int target, int min, int max){
        if(min > max)
            return -1;
        int mid = (min + max)/2;
        if(a[mid] == target)
            return mid;
        else if(a[mid] < target)
            return binarySearch(a, target, mid + 1, max);
        else
            return binarySearch(a, target, min, mid - 1);
    }

}
