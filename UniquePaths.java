public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int [][]paths= new int [m][n];
        if(m<1 || n<1) 
        return 0;
        if(m==1)
        return 1;
        if(n==1)
        return 1;
        for(int i=1;i<m;i++)
        paths[i][0]=1;
        for(int i=1;i<n;i++)
        paths[0][i]=1;
        //paths[0][1]=1;
       // paths[1][0]=1;
        paths[0][0]=0;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                paths[i][j]=paths[i-1][j]+paths[i][j-1];
            }
        }
        return paths[m-1][n-1];
    }
}
