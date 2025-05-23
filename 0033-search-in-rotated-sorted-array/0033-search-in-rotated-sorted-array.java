class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            
            int mid = start + (end - start) / 2;
            
            if(nums[mid] == target) {
                return mid;
            }
            
            else if(nums[start] <= nums[mid]) { // left array is sorted

                if(nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1; // searching in left side
                } else {
                    start = mid + 1; // serching in right side
                }
            }
            
            else if(nums[mid] <= nums[end]){ // right is sorted

                if(nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}