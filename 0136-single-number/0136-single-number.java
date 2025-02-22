import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(freq.containsKey(nums[i])) {

                freq.put(nums[i], freq.get(nums[i]) + 1);
            }
            else {
                freq.put(nums[i], 1);
            }
        }

        for(int key : freq.keySet()) {

            if(freq.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }
}