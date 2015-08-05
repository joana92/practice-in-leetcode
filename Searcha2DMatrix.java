public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int start=0;
        int end=row*col-1;
        int mid,rr,cc;
        if (end==0){
            if(matrix[0][0]==target) return true;
            else return false;
        }
        while(start+1<end){
            mid=start+(end-start)/2;
            rr=mid/col;
            cc=mid%col;
            if(matrix[rr][cc]==target) return true;
            if(matrix[rr][cc]>target) end=mid;
            if(matrix[rr][cc]<target) start=mid;
        }
        if(matrix[start/col][start%col]==target) return true;
        if(matrix[end/col][end%col]==target) return true;
        return false;
        
    }
}
