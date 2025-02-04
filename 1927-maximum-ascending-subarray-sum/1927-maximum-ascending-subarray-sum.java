class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int maxSum = 0;
        int n = nums.length;
        if(n == 1) {
            return nums[0];
        }
        for(int i = 0; i < n - 1; i++) {
            
            int sum = nums[i];
            while(i < n-1 && nums[i] < nums[i+1]) {
                sum += nums[i+1];
                i++;
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}