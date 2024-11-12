class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(mid == 0 && nums[mid] != nums[mid + 1]) return nums[mid];
            if(mid == nums.length - 1 && nums[mid] != nums[mid - 1]) return nums[mid];

            if(nums[mid- 1] != nums[mid] && nums[mid] != nums[mid + 1]) { // found
                return nums[mid];
            }
            else if(mid % 2 == 0) { // for even number of array size

                if(nums[mid - 1] == nums[mid]) { // it will exist in left side 
                    end = mid - 1;
                } else { // it will exist right side
                    start = mid + 1;
                }
            }
            else { // for odd number of array size

                if(nums[mid - 1] == nums[mid]) { // it will exist right side
                    start = mid + 1;
                } else { // it will exist in left side
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}