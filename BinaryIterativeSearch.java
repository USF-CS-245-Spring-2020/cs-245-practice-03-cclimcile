

public class BinaryIterativeSearch implements Practice03Search {

    public int search(int [] arr, int target){

            if(arr.length < 1){
                return -1;
            }

            int min = 0;
            int max = arr.length - 1;

            // This is to ensure that it does not cross or overlap in the search
            while (min <= max) {
                int mid = (max - min) / 2;

                if(mid - 1 < min){
                    return -1;
                }

                // Best Case: where target is at the center of the array
                if (arr[mid] == target)
                    return mid;
                    // Checks if the target is in the lower half
                if (arr[mid] < target) {
                    min = mid + 1;
                    // Checks if the target is in the higher half
                } else if (arr[mid] > target){
                    max = mid - 1;
                }
            }
            // If the target is not found
            return -1;
    }


}
