// This code is refered from the https://github.com/FreeTymeKiyan/LeetCode-Sol-Res/blob/master/Medium/WordSearch.java
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int len,row,col;
        len=word.length();
        row=board.length;
        col=board[0].length;
        if (board == null || board.length == 0 || board[0].length == 0 || word == null) return false;
        if (word.length() == 0) return true;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0))
                if( dfs(board,word,i,j,0))
                return true;
            }
        }
        return false;
    }
    
    public boolean dfs(char[][]board,String word,int i,int j,int n){
        if(n==word.length()) return true;
        //boundary checking
        if(i<0||i>=board.length||j>=board[0].length||j<0||board[i][j]!=word.charAt(n)) 
        return false;
        board[i][j]=' ';
       boolean result= dfs(borad,word,i-1,j,n+1)||dfs(borad,word,i+1,j,n+1)||dfs(board,word,i,j-1,n+1)||dfs(board,word,i,j+1,n+1);
       board[i][j]=word.charAt(n);
       return result;
    }
}
