import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {

            //Top row
            for(int i = startCol; i <= endCol; i++) {
                list.add(matrix[startRow][i]);
            }

            // Right Column
            for(int i = startRow + 1; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }

            // Bottom row
            for(int i = endCol - 1; i >= startCol; i--) {
                // matrix ended due to less row
                if(startRow == endRow) {
                    break;
                }
                list.add(matrix[endRow][i]);
            }

            // left column
            for(int i = endRow - 1; i >= startRow + 1; i--){
            // matrix ended due to less Column
                if(startCol == endCol) {
                    break;
                }
                list.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return list;
    }
}