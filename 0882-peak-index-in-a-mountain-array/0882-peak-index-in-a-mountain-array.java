class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 1; // peak never lies on 1st index
        int end = arr.length - 2; // neither lies on last index
        // by doing this we avoid checks in if statement

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if(arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            }
            else if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}