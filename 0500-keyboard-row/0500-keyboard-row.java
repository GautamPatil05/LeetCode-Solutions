class Solution {
    public String[] findWords(String[] words) {
        
        StringBuilder res = new StringBuilder("");
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        int firstCount = 0;
        int secondCount = 0;
        int thirdCount = 0;

        for(int i =0; i < words.length; i++) {

            String word = words[i];
            
            for(int j = 0; j < word.length(); j++) {

                char c = word.charAt(j);
                c = Character.toLowerCase(c);

                if(firstRow.indexOf(c) >= 0) firstCount++;
                if(secondRow.indexOf(c) >= 0) secondCount++;
                if(thirdRow.indexOf(c) >= 0) thirdCount++;
            }

            if(firstCount == word.length() || secondCount == word.length() || thirdCount == word.length()) {

                res.append(word).append(","); 
            }

            firstCount = 0;
            secondCount = 0;
            thirdCount = 0;
        }

        if(res.length() == 0) {
            return new String [0];
        }
        
        return res.toString().split(",");
    }
}