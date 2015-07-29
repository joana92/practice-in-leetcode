public class Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int num=0;
        if(matrix.length==0 || matrix[0].length==0) return false;
        int row=matrix.length;
        int col=matrix[0].length;
        int rowindex=0;
        int colindex=col-1;
        if(target>matrix[row-1][col-1] || target<matrix[0][0]) 
        return false;
        while(rowindex<row && colindex>=0){
            num=matrix[rowindex][colindex];
            if(target==num) 
            return true;
            if(target>num){
                rowindex++;
            }
            if(target<num){
                colindex--;
            }
        }
        return false;
        
    }
}
