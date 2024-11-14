class Solution {
    public int lengthOfLastWord(String s) {
        
        String str = s.trim();
        int i = str.length() - 1;
        int len = 0;
        while(i >= 0) {

            char c = str.charAt(i);
            if(c == ' ') {
                break;
            }
            else {
                len++;
            }
            i--;
        }
        return len;
    }
}