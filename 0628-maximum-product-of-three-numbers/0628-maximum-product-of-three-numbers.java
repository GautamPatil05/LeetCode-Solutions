class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;

        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }
}
/*
1. The three largest numbers yield the maximum product.
2. In cases where there are negative numbers, the product of the two smallest (negative) numbers and the    largest positive number may yield the maximum product.
 */