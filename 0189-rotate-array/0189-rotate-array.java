class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i]; // remember this line -  [(i + k) % n]
        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }        
    }
}

/*
k = k % length of input array => same as the k rotation just neglating rotation in which array becomes same as starting that is k = nums.length rotations

* (current position + remainder) % length of input array => it will give the exact position of element to add
 */

 