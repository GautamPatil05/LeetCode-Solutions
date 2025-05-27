class Solution {
    public int differenceOfSums(int n, int m) {
        
        int ndiv = 0;
        int div = 0;

        for(int i = 1; i <= n ; i++) {

            if(i % m != 0) {
                ndiv += i;
            } else {
                div += i;
            }
        }

        return ndiv - div;
    }
}