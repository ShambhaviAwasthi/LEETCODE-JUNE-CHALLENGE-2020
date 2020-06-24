// SHAMBHAVI AWASTHI
// LEETCODE JUNE CHALLENGE 2020
// DAY 24 : Unique Binary Search Trees

class Solution {
    public int numTrees(int n) {
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=1;j<=i;j++){
                arr[i]=arr[i]+arr[j-1]*arr[i-j];
            }
        }
        return arr[n];
    }
}
