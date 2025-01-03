class Solution {
    public int waysToSplitArray(int[] nums) {

        long leftSum = 0, rightSum = 0;
        // adding all in right side
        for (int num : nums) {
            rightSum += num;
        }

        int validSplits = 0;
        for (int i = 0; i < nums.length - 1; i++) { // num.length - 1 cause making groups last if taken last second group cannot formed 

            leftSum += nums[i]; // adding one by one in left 
            rightSum -= nums[i]; // subtracting one by one from right 
            if (leftSum >= rightSum) { // comparing
                validSplits++;
            }
        }

        return validSplits;
    }
}