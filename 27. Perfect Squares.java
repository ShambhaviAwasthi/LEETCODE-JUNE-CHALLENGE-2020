// SHAMBHAVI AWASTHI
// JUNE LEETCODE CHALLENGE 2020
// DAY 27: PERFECT SQUARES

class Solution {
    public int numSquares(int n) {
        if(n<=3)
            return n;
        int arr[]=new int[n+1];
        arr[0]=0; arr[1]=1; arr[2]=2; arr[3]=3;
        for(int i=4;i<=n;i++){
            arr[i]=i;
            for(int j=1;j<=Math.ceil(Math.sqrt(i));j++){
                if(j*j>i)
                break;
                else
                arr[i]=Math.min(arr[i],1+arr[i-(j*j)]);
            }
        }
        return arr[n];
        }
}
