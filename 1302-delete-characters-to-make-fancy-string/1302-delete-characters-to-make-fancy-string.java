class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ans.charAt(ans.length() - 1)) {
                cnt++;
                if (cnt < 3) {
                    ans.append(s.charAt(i));
                }
            } else {
                cnt = 1;
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}