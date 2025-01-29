class Solution {
    public int subarraySum(int[] nums, int k) {
       int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, 1); 

        for (int num : nums) {
            prefixSum += num;
            if (m.containsKey(prefixSum - k)) {
                count += m.get(prefixSum - k);
            }
            m.put(prefixSum, m.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}