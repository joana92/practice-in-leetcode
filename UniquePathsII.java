public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        int [][]paths=new int [row][col];
        if(row<1 || col<1 || obstacleGrid[0][0]==1) 
        return 0;
        paths[0][0]=1;
        for(int i=1;i<row;i++)
        { paths[i][0]=1;
            if(obstacleGrid[i][0]==1){
                for(int j=i;j<row;j++)
                paths[j][0]=0;
                break;
            }
        }
        for(int i=1;i<col;i++){
            paths[0][i]=1;
            if(obstacleGrid[0][i]==1){
                for(int j=i;j<col;j++)
                paths[0][j]=0;
                break;
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(obstacleGrid[i][j]==1)
                paths[i][j]=0;
                else
                paths[i][j]=paths[i-1][j]+paths[i][j-1];
            }
        }

        return paths[row-1][col-1];
        
    }
}
