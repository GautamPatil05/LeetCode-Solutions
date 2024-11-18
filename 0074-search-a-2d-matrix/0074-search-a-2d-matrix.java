class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        // starting with the up right corner and moving down or left until element found or else return false as it goes out of the array and condition unsatify 
        int row = 0;
        int col = matrix[0].length - 1;

        while(row <= matrix.length - 1 && col >= 0) {

            if(matrix[row][col] == target) {
                return true;
            }
            else if(matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}