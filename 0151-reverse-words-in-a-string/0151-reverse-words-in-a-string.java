class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder("");
        sb = sb.reverse(); // reverse string

        for(int i = 0; i < sb.length(); i++) {

            StringBuilder str = new StringBuilder();
            // find the word
            while(i < sb.length() && sb.charAt(i) != ' '){
                str.append(sb.charAt(i));
                i++;
            }

            str = str.reverse(); // reverse the word

            if(str.length() > 0) { // if word exist
                // ans.append(" "); 
                ans.append(" " +str); // append word with space
            } 
        }

        return ans.substring(1).toString();
    }
}