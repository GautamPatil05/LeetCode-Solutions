class Solution {
    public void reverseString(char[] s) {
        
        int st = 0;
        int end = s.length-1;

        while (st < s.length/2) {

            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--;
        }

        for (int i = 0; i<s.length; i++) {
            System.out.print( s[i]+",");
        }
    }
}