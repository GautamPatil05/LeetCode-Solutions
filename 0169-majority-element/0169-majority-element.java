// Moore algorithm
class Solution {
    public int majorityElement(int[] nums) {
        
        int freq = 0;
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            
            // start with 1st element, only gets 0 when the last elements frequecy is less 
            // the element has most frequecy never get 0 in next iteration so it becomes the ans
            if(freq == 0) {
                ans = nums[i];
            }

            if(ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }

        return ans;
    }
}