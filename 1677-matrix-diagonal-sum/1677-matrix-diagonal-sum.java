class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;

        for(int i = 0; i< mat.length; i++) {

            // primary sum
            sum += mat[i][i];

            //secondary sum
            if(i != mat.length - 1 - i) { // it repesent the intersect of matrix
                sum += mat[i][mat[0].length - 1 - i];   
                //accesses the element on the secondary diagonal in row i
            }
        }

        return sum;
    }
}