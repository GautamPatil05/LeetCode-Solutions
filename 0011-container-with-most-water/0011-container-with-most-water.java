class Solution {
    public int maxArea(int[] height) {
        
        int result = 0;
        // int n = height.length;
        // int[] left = new int[n];
        // int[] right = new int[n];

        // left[0] = height[0];
        // right[0] = height[n - 1];

        // for(int i = 1; i < n; i++) {

        //     left[i] = Math.max(left[i - 1], height[i]);
        // } 

        // int j = 1;
        // for(int i = n - 2; i >= 0; i--) {

        //     right[j] = Math.max(right[j - 1], height[i]);
        //     j++;
        // }

        int l = 0;
        int r = height.length - 1;

        while(l < r) {
            
            int border = Math.min(height[l], height[r]);
            int len = r - l;
            int res = border * len;
            result = Math.max(res, result);

            if(height[l] < height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return result;
    }
}