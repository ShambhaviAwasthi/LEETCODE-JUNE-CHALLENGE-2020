// Shambhavi Awasthi
// LEETCODE JUNE CHALLENGE
// DAY 17: Surrounded Regions

class Solution {
    
    static void floodFill(char [][]board, int x,int y,char prevC, char newC){
        int M=board.length;
    int N=board[0].length;
        if(x<0 || x>=M || y<0 || y>=N)
            return;
        if(board[x][y]!=prevC)
            return;
        board[x][y]=newC;
        floodFill(board,x+1,y,prevC,newC);
        floodFill(board,x-1,y,prevC,newC);
        floodFill(board,x,y+1,prevC,newC);
        floodFill(board,x,y-1,prevC,newC);
        
    }
    public void solve(char[][] mat) {
    
        int M=mat.length;
    
        
        if(M==0 || M==1)
            return;
        int N=mat[0].length;
        for (int i = 0; i < M; i++) 
        for (int j = 0; j < N; j++) 
            if (mat[i][j] == 'O') 
                mat[i][j] = '-'; 
        
        for (int i = 0; i < M; i++) // Left side 
        if (mat[i][0] == '-') 
            floodFill(mat, i, 0,'-', 'O'); 
        
    for (int i = 0; i < M; i++) // Right side 
        if (mat[i][N - 1] == '-') 
            floodFill(mat, i, N - 1,'-', 'O'); 
    for (int i = 0; i < N; i++) // Top side 
        if (mat[0][i] == '-') 
            floodFill(mat, 0, i, '-', 'O'); 
    for (int i = 0; i < N; i++) // Bottom side 
        if (mat[M - 1][i] == '-') 
            floodFill(mat, M - 1,i, '-', 'O'); 
      
    // Step 3: Replace  
    // all '-' with 'X' 
    for (int i = 0; i < M; i++) 
        for (int j = 0; j < N; j++) 
            if (mat[i][j] == '-') 
                mat[i][j] = 'X'; 
    }
}