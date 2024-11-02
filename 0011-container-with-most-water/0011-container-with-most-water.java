class Solution {
    public int maxArea(int[] height) {
        
        int result = 0;
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