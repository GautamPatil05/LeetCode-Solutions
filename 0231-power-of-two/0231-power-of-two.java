public class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}

/* Using bit manupulation
    class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;
        else
        return ((n & (n-1))==0);
    }
}
 */