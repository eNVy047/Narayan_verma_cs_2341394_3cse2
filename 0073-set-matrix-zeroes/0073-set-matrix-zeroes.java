import java.util.Arrays;

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] ith = new int[m]; 
        int[] jth = new int[n]; 
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    ith[i] = 1;
                    jth[j] = 1;
                }
            }
        }
        for(int i = 0; i < m; i++){
            if(ith[i] == 1){
                Arrays.fill(matrix[i], 0);
            }
        }

        for(int j = 0; j < n; j++){
            if(jth[j] == 1){
                for(int i = 0; i < m; i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}