// Shambhavi Awasthi
// LEETCODE JUNE CHALLENGE 2020
// DAY 21- Dungeon Game

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m=dungeon.length;
        int n=dungeon[0].length;
        int dp[][]=new int[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1)
                    dp[i][j]=Math.max(1,1-dungeon[i][j]);
                else if(i==m-1)
                    dp[i][j]=Math.max(1,dp[i][j+1]-dungeon[i][j]);
                else if(j==n-1)
                    dp[i][j]=Math.max(1,dp[i+1][j]-dungeon[i][j]);
                else
                    dp[i][j]=Math.max(1, Math.min(dp[i][j+1],dp[i+1][j])-dungeon[i][j]);
            }
        }
        return dp[0][0];    }
}
