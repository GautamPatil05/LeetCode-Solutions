class Solution {
    public boolean isPalindrome(int x) {
        
        int temp = 0;
        int num = x;

        while(x > 0) {

            int digit = x % 10;
            temp = temp * 10 + digit;
            x = x / 10;
        }

        if(temp == num) {
            return true;
        }
        return false;
    }
}