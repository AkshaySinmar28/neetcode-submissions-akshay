class Solution {
    public void rotate(int[][] matrix) {
        int a = matrix.length;
        for(int i=0; i < a/2; i++){
            var temp = matrix[a-i-1];
            matrix[a-i-1] = matrix[i];
            matrix[i] = temp;
        }
        for(int i=0; i < a; i++){
            for(int j=i+1; j < a; j++){
                var temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j]= temp;
            }
        }
    }
}
