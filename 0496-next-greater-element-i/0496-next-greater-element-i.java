class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int res[] = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {

            int num = nums1[i];
            int index = -1;
            for(int j = 0; j <nums2.length; j++) {

                if(num == nums2[j]) {

                    index = j;
                }
            }

            if(index == nums2.length - 1) {
                res[i] = -1;
            }

            else{

                for(int j = index + 1; j < nums2.length; j++) {

                    if(nums2[j] > num) {
                        res[i] = nums2[j];
                        break;
                    }
                }

                if(res[i] == 0) res[i] = -1;
            }
        }

        return res;
    }
}